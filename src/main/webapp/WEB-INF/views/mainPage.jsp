<%--
  Created by IntelliJ IDEA.
  User: danie
  Date: 02.12.2020
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h1>/user/save - POST dodawanie użytkownika (w Json podac co najmniej email imie i hasło)</h1>
        <h1>/user/list - GET lista użytkowników </h1>
        <h1>/user/checkLogin - GET walidacja logowania (w Json podac email i hasło)</h1>
        <h1>/user/get/id - GET infomacje dotyczace uzytkownika o danym id</h1>
        <h1>/user/get/email - GET informacje dotyczące użytkownika o danym email</h1>
        <h1>/user/friendsList/id - GET lista przyjaciół danego użytkownika</h1>
        <h1>/user/addFriend/u_id/f_id - GET dodawanie przyjaciela (f_id) do uzytkownika (u_id)</h1>
        <h1>/user/removeFriend/{u_id}/{f_id} - GET usuwanie przyjaciela (f_id) użytkownikowi (u_id)</h1>
        <h1>/user/delete/id - GET usuwanie użytkownika (id)</h1>

        <h1>/sendEmail - GET wysyła email potwierdzająy rejestracje (w Json podać email użytkownika)</h1>git

</body>
</html>
