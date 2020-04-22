package com.gosang.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: gosang
 * @DateTime: 2020/4/22 21:19
 * @Description: TODO
 */
@Data
public class Order {
    private Integer id;
    private User user;
    private Menu menu;
    private Admin admin;
    private Date date;
    private Integer state;

}
