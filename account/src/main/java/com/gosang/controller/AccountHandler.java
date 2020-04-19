package com.gosang.controller;

import com.gosang.entity.Account;
import com.gosang.entity.User;
import com.gosang.repository.AdminRepository;
import com.gosang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: gosang
 * @DateTime: 2020/4/19 16:27
 * @Description: TODO
 */
@RestController
@RequestMapping("/account")
public class AccountHandler {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public AdminRepository adminRepository;

    @GetMapping("/login/{username}/{password}/{type}")
    public Account login(@PathVariable("username") String username,@PathVariable("password") String password,@PathVariable("type") String type){

        Account account = new Account();

        switch (type){
            case "user":
                account = userRepository.login(username,password);
                break;
            case "admin":
                account = adminRepository.login(username,password);
                break;
        }
        return account;

    }
}
