package com.studyinghome.consumer.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;


/**
 * 用户
 *
 * @author leslie (https://studyinghome.com)
 * @date 2021/06/02
 */
@Data
@ToString
public class User {
    /**
     * id
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;

}
