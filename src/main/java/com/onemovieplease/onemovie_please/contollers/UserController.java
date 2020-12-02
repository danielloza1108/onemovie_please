package com.onemovieplease.onemovie_please.contollers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.onemovieplease.onemovie_please.classes.MovieMain;
import com.onemovieplease.onemovie_please.dao.UserDao;
import com.onemovieplease.onemovie_please.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController{

    private final UserDao userDao;
    private final MovieMain movieMain;
    @Autowired
    public UserController(UserDao userDao, MovieMain movieMain)   {
        this.userDao = userDao;
        this.movieMain = movieMain;
    }

    @GetMapping("/list")
    public List<User> getList(){
        List<User> list = userDao.findAll();
        return list;
    }

    @PostMapping("/save")
    public void add(@RequestBody User user){
        BCryptPasswordEncoder bCryptPasswordEncoder =
                new BCryptPasswordEncoder(10, new SecureRandom());
        String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
        String hash = movieMain.givenUsingJava8_whenGeneratingRandomAlphanumericString_thenCorrect();
            while (null != userDao.findByHash(hash)){
                hash = movieMain.givenUsingJava8_whenGeneratingRandomAlphanumericString_thenCorrect();
            }
            user.setPassword(encodedPassword);
            user.setHash(hash);
        userDao.save(user);

    }

    @GetMapping("/checkLogin")
    public User checkLogin(@RequestBody ObjectNode json, HttpServletRequest request){
        BCryptPasswordEncoder bCryptPasswordEncoder =
                new BCryptPasswordEncoder(10, new SecureRandom());
        if(userDao.findByEmail(json.get("email").asText()) != null){
            User user = userDao.findByEmail(json.get("email").asText());
            if(bCryptPasswordEncoder.matches(json.get("password").asText(),user.getPassword())){
                if(user.isActive()) {
                    HttpSession session = request.getSession();
                    session.setAttribute("user_id", user.getId());
                    session.setAttribute("user_email", user.getEmail());
                    session.setAttribute("user_name", user.getName());
                }
                return user;
            }
        }
        return new User();
    }


    @GetMapping("/get/{id}")
    public Optional<User> getById(@PathVariable Long id){
        return userDao.findById(id);
    }

    @GetMapping("/get/{email}")
    public User getByEmail(@PathVariable String email){
        return userDao.findByEmail(email);
    }

    @GetMapping("/friendsList/{id}")
    public List<Optional<User>> getFriendsList(@PathVariable Long id){
        List<Long> list = userDao.findFriends(id);
        List<Optional<User>> friends = new ArrayList<>();
        for (Long aLong : list) {
            friends.add(userDao.findById(aLong));
        }
        return friends;
    }

    @GetMapping("/addFriend/{u_id}/{f_id}")
    public void addFriend(@PathVariable Long u_id, @PathVariable Long f_id){
        userDao.addFriend(u_id,f_id);
    }

    @DeleteMapping("/removeFriend/{u_id}/{f_id}")
    public void removeFriend(@PathVariable Long u_id, @PathVariable Long f_id){
        userDao.removeFriend(u_id,f_id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        Optional<User> user = userDao.findById(id);
        userDao.delete(user.get());
    }




}
