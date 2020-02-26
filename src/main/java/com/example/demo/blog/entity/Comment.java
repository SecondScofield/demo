package com.example.demo.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ldx
 * @since 2020-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("blog_comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String commentContent;

    private LocalDateTime createTime;

    private Long createPerson;

    private Long articleId;

    private Long parentId;

    private Integer dzNum;

    private Integer watchNum;


}
