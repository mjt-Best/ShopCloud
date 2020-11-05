package com.mjt.entity;

import lombok.Data;

import java.util.Date;

/**
 * projectName: ShopCloud
 *
 * @author: 马江涛
 * time:2020/11/05  11:08
 * desription:订单列表
 */
@Data
public class OrderList {
    private int id;
    private int aid;
    private int uid;
    private int totalmoney;//总金额   单位分
    private int paymoney;//付款总金额   单位分
    private int freemoney;//优惠金额   单位分
    private int flag;//订单状态1 2 3 4 5 6 7 8
    private Date ctime;//订单创建日期
    private Date utime;//订单提交日期
}