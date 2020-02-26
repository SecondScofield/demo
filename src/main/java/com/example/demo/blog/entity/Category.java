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
@TableName("blog_category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类编码
     */
    private Long id;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 父节点
     */
    private Long parentId;

    private LocalDateTime createTime;

    private Long createPerson;

    private LocalDateTime updateTime;

    private Long updatePerson;


}
