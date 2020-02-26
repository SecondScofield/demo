package com.example.demo.blog.service.impl;

import com.example.demo.blog.entity.Category;
import com.example.demo.blog.mapper.CategoryMapper;
import com.example.demo.blog.service.ICategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
