package com.gosang.entity;

import lombok.Data;

/**
 * @Author: gosang
 * @DateTime: 2020/4/21 21:22
 * @Description: TODO
 */
@Data
public class Menu {
    private Integer id;
    private String name;
    private Double price;
    private String flavor;
    private Type type;
}
