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
@TableName("blog_tag")
public class Tag implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tagName;

    private LocalDateTime createTime;

    private Long createPerson;

    private LocalDateTime updateTime;

    private Long updatePerson;


}
