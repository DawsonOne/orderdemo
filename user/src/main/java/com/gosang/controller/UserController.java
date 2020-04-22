package com.gosang.controller;

import com.gosang.entity.User;
import com.gosang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Author: gosang
 * @DateTime: 2020/4/22 21:02
 * @Description: TODO
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserRepository userRepository;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody User user){
        user.setRegisterdate(new Date());
        userRepository.save(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }
}
