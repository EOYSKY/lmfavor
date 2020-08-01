create table if not exists lmfavor_sidebar_nav_subject
(
    id           int auto_increment comment '导航id'
        primary key,
    name         varchar(255) null comment '导航名称',
    subtopic_ids varchar(255) null comment '子主题id列表',
    icon         varchar(255) null comment '图标',
    user_id      int          null comment '所属用户id',
    gmt_create   timestamp    not null comment '创建时间',
    gmt_modify   timestamp    not null on update CURRENT_TIMESTAMP comment '修改时间'
);

create table if not exists lmfavor_site_info
(
    id               int auto_increment comment '网站id'
        primary key,
    user_id          int          not null comment '所属用户id',
    site_name        varchar(255) not null comment '网站名称',
    site_link        varchar(255) null comment '网址',
    site_icon        varchar(255) null comment '网站logo',
    site_description text         null comment '网站描述',
    subtopic_ids     text         not null comment '所属子主题id列表',
    gmt_create       timestamp    not null comment '创建时间',
    gmt_modify       timestamp    not null on update CURRENT_TIMESTAMP comment '修改时间'
);

create table if not exists lmfavor_subtopic
(
    id            int auto_increment comment '子主题Id'
        primary key,
    name          varchar(255) not null comment '子主题名称',
    owned_nav_ids varchar(255) not null comment '所属导航id列表',
    icon          varchar(255) null comment '图标',
    user_id       int          not null comment '所属用户id',
    gmt_create    timestamp    not null comment '创建时间',
    gmt_modify    timestamp    not null on update CURRENT_TIMESTAMP comment '修改时间'
);

create table if not exists lmfavor_user
(
    id         int auto_increment comment 'User Id',
    user_name  varchar(32)  not null comment '用户名',
    password   varchar(64)  not null comment '用户密码',
    nick_name  varchar(64)  null comment '用户昵称',
    real_name  varchar(64)  null comment '真实姓名',
    age        int          null comment '年龄',
    gender     int          null comment '0-男,1-女',
    phone      bigint       null comment '电话号码',
    email      varchar(64)  not null comment '电子邮箱',
    wechat     varchar(128) null comment '微信号',
    address    varchar(255) null comment '地址',
    avatar     varchar(255) null comment '头像',
    gmt_create timestamp    not null comment '创建时间',
    gmt_modify timestamp    not null on update CURRENT_TIMESTAMP comment '修改时间',
    constraint uk_id
        unique (id),
    constraint uk_user_name
        unique (user_name)
);

alter table lmfavor_user
    add primary key (id);


