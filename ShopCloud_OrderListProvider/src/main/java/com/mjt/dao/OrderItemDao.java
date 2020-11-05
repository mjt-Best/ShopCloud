package com.mjt.dao;

import com.mjt.dto.OrderItemDto;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * projectName:ShopCloud
 *
 * @author:马江涛
 * @Time: 2020/11/05  11:18
 * description:商品详情表
 */
@Repository
public interface OrderItemDao {
    //添加商品详情
    @Insert("insert into t_orderitem(skuid,oid,) value()")
    int insert(OrderItemDto orderItemDto);
}
