package com.mjt.config;

/**
 * @program: CloudLike
 * @description: 记录RabbitMQ消息的类型
 * @author: Feri(邢朋辉)
 * @create: 2020-11-03 10:16
 */
public class RabbitMQTypeConfig {
    //点赞新增
    public static final int MQ_LIKE_ADD=1;
    //点赞删除
    public static final int MQ_LIKE_DEL=2;

    //购物车 新增
    public static final int MQ_CART_ADD=3;
    //购物车修改
    public static final int MQ_CART_UPDATE=4;


    //订单 下单消息
    public static final int MQ_Order_ADD=5;



}
