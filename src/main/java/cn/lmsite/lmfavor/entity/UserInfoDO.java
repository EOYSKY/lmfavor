package cn.lmsite.lmfavor.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * 用户信息DO
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
@Data
public class UserInfoDO implements Serializable {
    /** id */
    private Integer       id;
    /** 用户名 */
    private String        userName;
    /** 密码 */
    private String        password;
    /** 用户昵称 */
    private String        nickName;
    /** 真实姓名 */
    private String        realName;
    /** 年龄 */
    private Integer       age;
    /** 性别: 0-男,1-女 */
    private Integer        gender;
    /** 电话号码 */
    private Long          phone;
    /** 电子邮件 */
    private String        eMail;
    /** 微信号 */
    private String        wechat;
    /** 地址 */
    private String        address;
    /** 头像 */
    private String        avatar;
    /** 创建时间 */
    private LocalDateTime gmtCreate;
    /** 修改时间 */
    private LocalDateTime gmtModify;

    private static final long serialVersionUID = 1L;
}