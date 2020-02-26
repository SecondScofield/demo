package com.example.demo.blog.service.impl;

import com.example.demo.blog.entity.Comment;
import com.example.demo.blog.mapper.CommentMapper;
import com.example.demo.blog.service.ICommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
