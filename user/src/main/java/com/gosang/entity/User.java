package com.gosang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @Author: gosang
 * @DateTime: 2020/4/22 20:57
 * @Description: TODO
 */
@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;
}
