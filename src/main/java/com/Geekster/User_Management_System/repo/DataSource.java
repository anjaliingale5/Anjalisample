package com.Geekster.User_Management_System.repo;

import com.Geekster.User_Management_System.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataSource {

    @Bean
    List<User> getUserListInit() {

        return new ArrayList<>();
    }
}