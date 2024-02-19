package com.belajarOne.belajar1.repository;

import com.belajarOne.belajar1.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public User saveUser(User user){
        user.setId((long) users.size()+1);
        users.add(user); //representasi db
        return user;
    }

    public List<User> getUsersById(Long id){
        return users;
    }

    public List<User> getAllUsers(){
        return users;
    }
}
