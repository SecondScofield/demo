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
@TableName("blog_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String userName;

    private String password;

    private String salt;

    private String relName;

    private String userImage;

    private String phone;

    private String mail;

    private String sex;

    private String status;

    private LocalDateTime createTime;


}
