package com.mjt.dao;

import com.mjt.dto.OrderDto;
import com.mjt.entity.OrderItem;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * projectName:ShopCloud
 *
 * @author:马江涛
 * @Time: 2020/11/05  11:18
 * description:商品列表
 */
@Repository
public interface OrderListDao {
    //添加订单列表
    @Insert("insert into t_order")
    int insertOrder(OrderDto orderDto);

}
