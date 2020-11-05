package com.mjt.entity;

import lombok.Data;

import java.util.Date;

/**
 * projectName: ShopCloud
 *
 * @author: 马江涛
 * time:2020/11/05  11:12
 * desription:订单详情表
 */
@Data
public class OrderItem {
    private int id;
    private int skuid;//商品的skuid
    private int oid;//订单id
    private int uid;//用户id
    private int scount;
    private int price;//价格(没有优惠的价格)   单位分
    private Date ctime;
}