package com.example.demo.blog.service.impl;

import com.example.demo.blog.entity.User;
import com.example.demo.blog.mapper.UserMapper;
import com.example.demo.blog.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ldx
 * @since 2020-02-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
