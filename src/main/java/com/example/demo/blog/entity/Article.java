package com.example.demo.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("blog_article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键编码
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 点赞数
     */
    private Integer dzNum;

    /**
     * 浏览数
     */
    private Integer watchNum;

    /**
     * 文章类别编码
     */
    private Long categoryId;

    /**
     * 文章标签编码
     */
    private Long tagId;

    /**
     * 推荐位编码
     */
    private Long recommendId;

    /**
     * 文章发布时间
     */
    private LocalDateTime createTime;

    /**
     * 文章发布者
     */
    private Long createPerson;

    /**
     * 文章最后修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 文章修改人
     */
    private Long updatePerson;


}
