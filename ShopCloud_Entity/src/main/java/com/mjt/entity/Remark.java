package com.mjt.entity;

import lombok.Data;

import java.util.Date;

/**
 * projectName: ShopCloud
 *
 * @author: 马江涛
 * time:2020/11/05  20:48
 * desription:技工点评价类
 */
@Data
public class Remark {
    private int id;
    private int uid;//用户id
    private int qid;//快捷评论id
    private int wid;//技工id
    private String content;//评论内容
    private int rscore;//总体评价分数
    private String photourl;//上传图片路径
    private Date ctime;
}