package com.Geekster.User_Management_System.controller;

import com.Geekster.User_Management_System.entity.User;
import com.Geekster.User_Management_System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {



    @Autowired
    UserService userService;

    @PostMapping("addUser")
    public String addUser(@RequestBody User user){

        return UserService.addUser(user);
    }


    @GetMapping("getUser/userid/{userid}")
    public  List<User> getUser(@PathVariable Integer userid){

        return UserService.getUser(userid);
    }

    @GetMapping("getAllUser")
    public List<User> getAllUser(){

        return UserService.getAllUser();
    }


}
