package com.mjt.controller;

import com.mjt.dto.RemarkDto;
import com.mjt.service.intf.RemarkService;
import com.mjt.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: ShopCloud
 *
 * @author: 马江涛
 * time:2020/11/05  23:53
 * desription:
 */
@RestController
@RequestMapping("/api/remart/")
public class RemarkController {
    @Autowired
    private RemarkService remarkService;
    @RequestMapping("addRemart.do")
    public R addRemart(RemarkDto remarkDto){
        return remarkService.addRemark(remarkDto);
    }
}