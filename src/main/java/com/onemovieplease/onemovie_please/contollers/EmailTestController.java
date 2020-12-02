package com.onemovieplease.onemovie_please.contollers;

import com.onemovieplease.onemovie_please.dao.UserDao;
import com.onemovieplease.onemovie_please.entity.User;
import com.onemovieplease.onemovie_please.service.EmailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.http.HttpRequest;

@Controller
public class EmailTestController {
    private final UserDao userDao;
    private final ITemplateEngine iTemplateEngine;
    private final EmailService emailService;
    @Value("${spring.mail.username}")
    private  String fromEmail;
    public EmailTestController(UserDao userDao, ITemplateEngine iTemplateEngine, EmailService emailService) {
        this.userDao = userDao;
        this.iTemplateEngine = iTemplateEngine;
        this.emailService = emailService;
    }

    @GetMapping("/sendEmail")
    @ResponseBody
    public void sampleEmail(@RequestBody User user, HttpServletRequest request, Model model) throws MessagingException {
        Context context = new Context();
        User user1 = userDao.findByEmail(user.getEmail());
        context.setVariable("header", "OneMoviePlease");
        context.setVariable("title", "Potwierdzenie rejestracji");
        context.setVariable("description", "Kliknij aby potwierdzić");
        context.setVariable("userEmail","https://onemovieplease.herokuapp.com/setRegister/"+user1.getHash());
        String body =iTemplateEngine.process("template", context);
        emailService.prepareAndSend(user.getEmail(), "Potwierdzenie rejestracji", body);
    }

    @GetMapping("/setRegister/{hash}")
    @ResponseBody
    public String setRegistry(HttpServletRequest request, @PathVariable String hash){
        User user = userDao.findByHash(hash);
        user.setActive(true);
        userDao.save(user);
        return "Konto jest już aktywne";
    }
}