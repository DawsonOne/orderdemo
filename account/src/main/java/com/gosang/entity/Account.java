package com.gosang.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: gosang
 * @DateTime: 2020/4/19 16:12
 * @Description: TODO
 */
@Data
public class Account {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;
}