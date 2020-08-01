package cn.lmsite.lmfavor.dao;

import java.util.List;

import cn.lmsite.lmfavor.entity.UserInfoDO;

/**
 * 用户信息服务
 *
 * @author jonny
 */
public interface UserInfoService {

    /**
     * 按主键删除
     *
     * @param id id
     * @return int
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入
     *
     * @param record 记录
     * @return int
     */
    int userRegister(UserInfoDO record);

    /**
     * 插入或更新
     *
     * @param record 记录
     * @return int
     */
    int insertOrUpdate(UserInfoDO record);

    /**
     * 插入或更新选择性
     *
     * @param record 记录
     * @return int
     */
    int insertOrUpdateSelective(UserInfoDO record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */
    int insertSelective(UserInfoDO record);

    /**
     * 选择通过主键
     *
     * @param id id
     * @return {@link UserInfoDO}
     */
    UserInfoDO selectByPrimaryKey(Integer id);

    /**
     * 选择通过主键
     *
     * @param userName
     * @return {@link UserInfoDO}
     */
    UserInfoDO selectByUserName(String userName);

    /**
     * 更新主键的选择性
     *
     * @param record 记录
     * @return int
     */
    int updateByPrimaryKeySelective(UserInfoDO record);

    /**
     * 更新的主键
     *
     * @param record 记录
     * @return int
     */
    int updateByPrimaryKey(UserInfoDO record);

    /**
     * 批处理更新
     *
     * @param list 列表
     * @return int
     */
    int updateBatch(List<UserInfoDO> list);

    /**
     * 更新批选择性
     *
     * @param list 列表
     * @return int
     */
    int updateBatchSelective(List<UserInfoDO> list);

    /**
     * 批量插入
     *
     * @param list 列表
     * @return int
     */
    int batchInsert(List<UserInfoDO> list);

}
