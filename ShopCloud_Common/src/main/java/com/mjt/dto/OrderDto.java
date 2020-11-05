package com.mjt.dto;

import lombok.Data;

import java.util.Date;

/**
 * projectName: ShopCloud
 *
 * @author: 马江涛
 * time:2020/11/05  11:35
 * desription:订单表
 */
@Data
public class OrderDto {
    private int aid;
    private int uid;
    private int totalmoney;//总金额   单位分
    private int paymoney;//付款总金额   单位分
    private int freemoney;//优惠金额   单位分

}