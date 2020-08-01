package cn.lmsite.lmfavor.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class SidebarNavSubjectsDO implements Serializable {
    /**
    * 导航id
    */
    private Integer id;

    /**
    * 导航名称
    */
    private String name;

    /**
    * 子主题id列表
    */
    private String subtopicIds;

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