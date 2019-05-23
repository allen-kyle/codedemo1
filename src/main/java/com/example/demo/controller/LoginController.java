package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.model.PO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/register")
    public  String loginVerify(User user){

        userDao.addUser(user);
        System.out.println("user = [" + user + "]");
        return "{\"status\":\"ok!!!\"}";
          }

    @RequestMapping("/select")
     public String getName(User user){

        User user1= userDao.getName(user);
        String name =user1.getUsername();
        return name;
     }
    }

