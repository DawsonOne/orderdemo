package com.gosang.controller;

import com.gosang.entity.Order;
import com.gosang.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: gosang
 * @DateTime: 2020/4/22 21:45
 * @Description: TODO
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    public OrderRepository orderRepository;

    @PostMapping("/save")
    public void save(@RequestBody Order order){
        orderRepository.save(order);
    }

    @DeleteMapping("/deleteByMid/{mid}")
    public void deleteByMid(@PathVariable("mid") Integer mid){
        orderRepository.deleteByMid(mid);
    }

    @DeleteMapping("/deleteByUid/{uid}")
    public void deleteByUid(@PathVariable("uid") Integer uid){
        orderRepository.deleteByUid(uid);
    }

    @GetMapping("/findAllByState/{state}")
    public List<Order> findAllByState(@PathVariable("state") Integer state){
        Order order = new Order();
        return orderRepository.findAllByState(state);
    }

    @PutMapping("/updateState/{id}/{state}/{aid}")
    public void updateState(@PathVariable("id") Integer id, @PathVariable("state") Integer state, @PathVariable("aid") Integer aid){
        orderRepository.updateState(id,aid,state);
    }

}
