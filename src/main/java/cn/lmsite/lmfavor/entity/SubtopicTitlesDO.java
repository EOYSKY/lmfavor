package cn.lmsite.lmfavor.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class SubtopicTitlesDO implements Serializable {
    /**
    * 子主题Id
    */
    private Integer id;

    /**
    * 子主题名称
    */
    private String name;

    /**
    * 所属导航id列表
    */
    private String ownedNavIds;

    /**
    * 图标
    */
    private String icon;

    /**
    * 所属用户id
    */
    private Integer userId;

    /**
    * 创建时间
    */
    private LocalDateTime gmtCreate;

    /**
    * 修改时间
    */
    private LocalDateTime gmtModify;

    private static final long serialVersionUID = 1L;
}