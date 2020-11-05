package com.mjt.service.Impl;

import com.mjt.dao.RemarkDao;
import com.mjt.dto.RemarkDto;
import com.mjt.service.intf.RemarkService;
import com.mjt.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: ShopCloud
 *
 * @author: 马江涛
 * time:2020/11/05  23:30
 * desription:
 */
@Service
public class RemarkServiceImpl implements RemarkService {
    @Autowired
    private RemarkDao remarkDao;
    @Override
    public R addRemark(RemarkDto remarkDto) {
        if (remarkDto !=null) {
            if (remarkDto.getWid() > 0 && remarkDto.getRscore() > 0 && remarkDto.getQid() > 0 && remarkDto.getContent() != null && remarkDto.getPhotourl() != null) {
                if (remarkDao.add(remarkDto) > 0) {
                    return R.ok();
                }else {
                    return R.fail("亲，评论添加失败");
                }
            }else{
                R.fail("亲，接口非法参数！");
            }
        }
        return R.fail("亲，接口参数为空！");
    }

    @Override
    public R queryRemark(RemarkDto remarkDto) {

        return null;
    }
}