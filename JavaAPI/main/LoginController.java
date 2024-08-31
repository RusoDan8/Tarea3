package com.chilaquilesrestaurant.controller;
import com.chilaquilesrestaurant.model.User;
import com.chilaquilesrestaurant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class LoginController
{
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        Optional<User> user = userService.authenticate(username, password);
        if (user.isPresent()) {
            return "Bienvenido, " + user.get().getRole().name();
        } else {
            return "Usuario o contraseña incorrectos";
        }
    }
}
