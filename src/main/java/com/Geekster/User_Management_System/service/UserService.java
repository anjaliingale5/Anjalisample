package com.Geekster.User_Management_System.service;


import com.Geekster.User_Management_System.entity.User;
import com.Geekster.User_Management_System.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    static UserRepo userRepo;


    public static String addUser(User user) {

      userRepo.addUser(user);
        return "Added";
    }

    public static List<User> getUser(Integer userid) {

        return UserRepo.getUser(userid);
    }

    public static List<User> getAllUser() {

        return userRepo.getUserList();
    }
}
