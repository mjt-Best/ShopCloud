package com.mjt.dao;

import com.mjt.dto.RemarkDto;
import com.mjt.entity.Remark;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * projectName:ShopCloud
 *
 * @author:马江涛
 * @Time: 2020/11/05  20:59
 * description:
 */
@Repository
public interface RemarkDao {
    //添加评论
    int add(RemarkDto remarkDto);
}
