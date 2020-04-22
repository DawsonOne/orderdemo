package com.gosang.repository;

import com.gosang.entity.User;

import java.util.List;

/**
 * @Author: gosang
 * @DateTime: 2020/4/22 20:59
 * @Description: TODO
 */
public interface UserRepository {
    public List<User> findAll();
    public int count();
    public void save(User user);
    public void deleteById(Integer id);
}
