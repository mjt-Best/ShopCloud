package com.mjt.dto;

import lombok.Data;

/**
 * projectName: ShopCloud
 *
 * @author: 马江涛
 * time:2020/11/04  22:42
 * desription:添加dto
 */
@Data
public class CartAddDto {
    private int skuid;
    private int uid;
    private int jprice;
    private int count;
}