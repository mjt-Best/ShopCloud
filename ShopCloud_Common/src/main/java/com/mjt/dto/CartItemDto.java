package com.mjt.dto;

import lombok.Data;

/**
 * projectName: ShopCloud
 *
 * @author: 马江涛
 * time:2020/11/04  23:25
 * desription:
 */
@Data
public class CartItemDto {
    private Integer id;
    private Integer count;// +表示增加   -表示减
}