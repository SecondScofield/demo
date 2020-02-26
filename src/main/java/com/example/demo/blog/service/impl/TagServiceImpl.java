package com.example.demo.blog.service.impl;

import com.example.demo.blog.entity.Tag;
import com.example.demo.blog.mapper.TagMapper;
import com.example.demo.blog.service.ITagService;
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
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
