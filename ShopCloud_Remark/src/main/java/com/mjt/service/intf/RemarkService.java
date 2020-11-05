package com.mjt.service.intf;

import com.mjt.dto.RemarkDto;
import com.mjt.vo.R;

/**
 * projectName:ShopCloud
 *
 * @author:马江涛
 * @Time: 2020/11/05  23:29
 * description:
 */
public interface RemarkService {
    //添加评论
    R addRemark(RemarkDto remarkDto);
    //查询评论
    R queryRemark(RemarkDto remarkDto);
}
