package com.mjt.dao;

import com.mjt.dto.CartAddDto;
import com.mjt.dto.CartItemDto;
import com.mjt.entity.Cart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * projectName: ShopCloud
 *
 * @author: 马江涛
 * time:2020/11/04  22:46
 * desription:
 */
@Repository
public interface CartDao {
    //查询skuid是否存在
    @Select("select * from t_cart where kuid = #{kuid} and uid = #{uid} limit 1")
    Cart queryByUid(CartAddDto cartAddDto);
    //查询这个用户的购物车的信息
    @Select("select * from t_cart where uid = #{uid}")
    List<Cart> queryByUidAll(int uid);
    //添加商品到购物车
    @Insert("insert into t_cart(uid,skuid,jprice,scount,ctime) values(#{uid},#{skuid},#{jprice},#{scount},now())")
    int insert(CartAddDto cartAddDto);
    //购物车的商品数量增减
    @Update("update t_cart set scount = scount +#{scount} where skuid = #{skuid} and uid = #{uid}")
    int updatePlus(CartAddDto cartAddDto);
    //在商品信息中增减数量再添加到数据库中
    @Update("update t_cart set scount = scount +#{scount} where id = #{id}")
    int update(CartItemDto cartItemDto);


}