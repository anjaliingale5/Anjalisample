package com.Geekster.User_Management_System.repo;

import com.Geekster.User_Management_System.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {

    @Autowired
    private static List<User> userList;

    public static List<User> getUser(Integer userid) {

        return userList;
    }

    @Bean
    public List<User> getUserList() {
        return userList;
    }

    public void addUser(User user) {
        User User = new User();
        userList.add(User);
    }
}
