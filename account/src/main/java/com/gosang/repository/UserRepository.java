package com.gosang.repository;

import com.gosang.entity.Account;
import com.gosang.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author: gosang
 * @DateTime: 2020/4/19 16:16
 * @Description: TODO
 */
@Repository
public interface UserRepository {
    public User login(String username, String password);
}
