package com.example.demo.blog.service.impl;

import com.example.demo.blog.entity.Log;
import com.example.demo.blog.mapper.LogMapper;
import com.example.demo.blog.service.ILogService;
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
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {

}
