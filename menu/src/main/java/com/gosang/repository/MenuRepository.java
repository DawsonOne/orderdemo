package com.gosang.repository;

import com.gosang.entity.Menu;

import java.util.List;

/**
 * @Author: gosang
 * @DateTime: 2020/4/21 21:23
 * @Description: TODO
 */
public interface MenuRepository {
    public List<Menu> findAll();
    public Menu findById(Integer id);
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(Integer id);
}
