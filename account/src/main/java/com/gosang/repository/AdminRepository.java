package com.gosang.repository;

import com.gosang.entity.Account;
import com.gosang.entity.Admin;
import org.springframework.stereotype.Repository;

/**
 * @Author: gosang
 * @DateTime: 2020/4/19 16:16
 * @Description: TODO
 */
@Repository
public interface AdminRepository {
    public Admin login(String username, String password);
}
