package com.belajarOne.belajar1.controller;

import com.belajarOne.belajar1.model.User;
import com.belajarOne.belajar1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//RestController adalah gabungan dari response body dan controller
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    @Autowired
    public UserController(UserService service){
        this.service = service;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @GetMapping("/{id}")
    public List<User> getUserId(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/all")
    public List<User> getUserAll() {
        return service.getAllUsers();
    }
}
