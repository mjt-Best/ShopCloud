package com.mjt.dto;

import lombok.Data;

/**
 * projectName: ShopCloud
 *
 * @author: 马江涛
 * time:2020/11/05  11:44
 * desription:商品详情表
 */
@Data
public class OrderItemDto {
    private int skuid;//商品的skuid
    private int oid;//订单id
    private int uid;//用户id
    private int scount;
    private int price;//价格(没有优惠的价格)   单位分
}