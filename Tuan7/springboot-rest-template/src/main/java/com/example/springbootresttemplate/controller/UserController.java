package com.example.springbootresttemplate.controller;

import com.example.springbootresttemplate.model.User;
import com.example.springbootresttemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/users/{userId}")
    public String deleteUserById(@PathVariable int userId) {
        userService.deleteUserById(userId);
        return "User with id: " + userId + " was deleted";
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }
}
