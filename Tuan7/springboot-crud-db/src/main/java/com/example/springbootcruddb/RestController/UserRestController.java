package com.example.springbootcruddb.RestController;

import com.example.springbootcruddb.entity.User;
import com.example.springbootcruddb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{userId}")
    public User findById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/users")
    public User save(@RequestBody User user) {
        user.setId(0);
        userService.saveUser(user);
        return user;
    }

    @PutMapping("/users")
    public User update(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }


    @DeleteMapping("/users/{userId}")
    public String deleteById(@PathVariable int userId) {
        User user = userService.getUserById(userId);
        if (user == null) {
            throw new RuntimeException("User id not found - " + userId);
        }
        userService.deleteUserById(userId);
        return "Deleted user id - " + userId;
    }
}
