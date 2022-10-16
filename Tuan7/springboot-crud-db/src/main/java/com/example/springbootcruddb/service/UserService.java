package com.example.springbootcruddb.service;

import com.example.springbootcruddb.entity.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public User getUserById(int id);
    public void deleteUserById(int id);
    public List<User> getAllUsers();
}
