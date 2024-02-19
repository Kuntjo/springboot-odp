package com.belajarOne.belajar1.service;

import com.belajarOne.belajar1.model.User;
import com.belajarOne.belajar1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    //dependecy injection, ditandakan dengan autowired. Mencegah coupling dependecy
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
        return userRepository.saveUser((user));
    }

    public List<User> getById(Long id){
        return userRepository.getUsersById(id);
    }

    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }
}
