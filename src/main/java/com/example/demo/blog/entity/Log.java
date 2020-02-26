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
@TableName("blog_log")
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    private String logDesc;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String requestUrl;

    private String requestType;

    private String requestParam;

    private String userAddress;

    private String userIp;

    private Long userId;


}
