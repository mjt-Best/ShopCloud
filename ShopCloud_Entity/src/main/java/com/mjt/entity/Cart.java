package com.mjt.entity;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * projectName: ShopCloud
 *
 * @author: 马江涛
 * time:2020/11/04  22:50
 * desription:
 */
@Repository
@NoArgsConstructor
public class Cart {
    private Integer id;
    private Integer uid;
    private Integer skuid;
    private Integer scount;
    private Integer jprice;
    private Date ctime;

    public Cart(Integer uid, Integer skuid, Integer scount, Integer jprice) {
        this.uid = uid;
        this.skuid = skuid;
        this.scount = scount;
        this.jprice = jprice;
    }
}