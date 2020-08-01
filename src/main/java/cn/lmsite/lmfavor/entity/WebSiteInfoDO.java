package cn.lmsite.lmfavor.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class WebSiteInfoDO implements Serializable {
    /**
    * 网站id
    */
    private Integer id;

    /**
    * 所属用户id
    */
    private Integer userId;

    /**
    * 网站名称
    */
    private String siteName;

    /**
    * 网址
    */
    private String siteLink;

    /**
    * 网站logo
    */
    private String siteIcon;

    /**
    * 创建时间
    */
    private LocalDateTime gmtCreate;

    /**
    * 修改时间
    */
    private LocalDateTime gmtModify;

    /**
    * 网站描述
    */
    private String siteDescription;

    /**
    * 所属子主题id列表
    */
    private String subtopicIds;

    private static final long serialVersionUID = 1L;
}