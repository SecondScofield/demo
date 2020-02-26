package com.example.demo.blog.service.impl;

import com.example.demo.blog.entity.Link;
import com.example.demo.blog.mapper.LinkMapper;
import com.example.demo.blog.service.ILinkService;
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
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements ILinkService {

}
