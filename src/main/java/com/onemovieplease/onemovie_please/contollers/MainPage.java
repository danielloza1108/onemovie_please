package com.onemovieplease.onemovie_please.contollers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class MainPage {
    @GetMapping("/")
    @ResponseBody
    public String mainPage(){
        return "<h1>/user/save - POST dodawanie użytkownika (w Json podac co najmniej email imie i hasło)</h1>\n" +
                "        <h1>/user/list - GET lista użytkowników </h1>\n" +
                "        <h1>/user/checkLogin - GET walidacja logowania (w Json podac email i hasło)</h1>\n" +
                "        <h1>/user/get/id - GET infomacje dotyczace uzytkownika o danym id</h1>\n" +
                "        <h1>/user/get/email - GET informacje dotyczące użytkownika o danym email</h1>\n" +
                "        <h1>/user/friendsList/id - GET lista przyjaciół danego użytkownika</h1>\n" +
                "        <h1>/user/addFriend/u_id/f_id - GET dodawanie przyjaciela (f_id) do uzytkownika (u_id)</h1>\n" +
                "        <h1>/user/removeFriend/{u_id}/{f_id} - GET usuwanie przyjaciela (f_id) użytkownikowi (u_id)</h1>\n" +
                "        <h1>/user/delete/id - GET usuwanie użytkownika (id)</h1>\n" +
                "\n" +
                "        <h1>/sendEmail - GET wysyła email potwierdzająy rejestracje (w Json podać email użytkownika)</h1>";
    }
}
