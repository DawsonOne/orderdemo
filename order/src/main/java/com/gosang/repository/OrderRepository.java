package com.gosang.repository;

import com.gosang.entity.Order;

import java.util.List;

/**
 * @Author: gosang
 * @DateTime: 2020/4/22 21:25
 * @Description: TODO
 */
public interface OrderRepository {
    public void save(Order order);
    public List<Order> findAllByUid(Integer uid);
    public int countByUid(Integer uid);
    public void deleteByMid(Integer mid);
    public void deleteByUid(Integer uid);
    public List<Order> findAllByState(int state);
    public int countByState(int state);
    public void updateState(Integer id,Integer aid,int state);
}
