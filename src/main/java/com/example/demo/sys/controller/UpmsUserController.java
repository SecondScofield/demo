package com.example.demo.sys.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.sys.entity.UpmsUser;
import com.example.demo.sys.service.IUpmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户 前端控制器
 * </p>
 *
 * @author ldx
 * @since 2020-01-10
 */
@RestController
@RequestMapping("/sys/upms-user")
public class UpmsUserController {

    @Autowired
    private IUpmsUserService iUpmsUserService;

    @RequestMapping("/listAll")
    public List<UpmsUser> getList(){
        QueryWrapper<UpmsUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("user_id");
        return iUpmsUserService.list(queryWrapper);
    }
}
