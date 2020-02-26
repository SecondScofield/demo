package com.example.demo.blog.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.blog.entity.User;
import com.example.demo.blog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ldx
 * @since 2020-02-26
 */
@RestController
@RequestMapping("/blog/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/getUserList")
    public List<User> getUserList(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("id");
        return iUserService.list(queryWrapper);
    }
}
