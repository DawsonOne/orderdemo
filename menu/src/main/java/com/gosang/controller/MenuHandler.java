package com.gosang.controller;

import com.gosang.entity.Menu;
import com.gosang.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: gosang
 * @DateTime: 2020/4/21 21:50
 * @Description: TODO
 */
@RestController
@RequestMapping("/menu")
public class MenuHandler {
    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/findAll")
    public List<Menu> findAll(){
        return menuRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") Integer id){
        return menuRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Menu menu){
        menuRepository.save(menu);
    }

    @PutMapping("/update")
    public void update(@RequestBody Menu menu){
        menuRepository.update(menu);
    }

    @DeleteMapping("deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        menuRepository.deleteById(id);
    }

}
