package cn.lmsite.lmfavor.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.lmsite.lmfavor.dao.UserInfoService;
import cn.lmsite.lmfavor.entity.UserInfoDO;
import cn.lmsite.lmfavor.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
 * 用户信息服务impl
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    /** 用户信息映射器 */
    @Resource
    private UserInfoMapper userInfoMapper;

    /**
     * 按主键删除
     *
     * @param id id
     * @return int
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userInfoMapper.deleteByPrimaryKey(id);
    }

    /**
     * 插入
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int userRegister(UserInfoDO record) {
        return userInfoMapper.userRegister(record);
    }

    /**
     * 插入或更新
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int insertOrUpdate(UserInfoDO record) {
        return userInfoMapper.insertOrUpdate(record);
    }

    /**
     * 插入或更新选择性
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int insertOrUpdateSelective(UserInfoDO record) {
        return userInfoMapper.insertOrUpdateSelective(record);
    }

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int insertSelective(UserInfoDO record) {
        return userInfoMapper.insertSelective(record);
    }

    /**
     * 选择通过主键
     *
     * @param id id
     * @return {@link UserInfoDO}
     */
    @Override
    public UserInfoDO selectByPrimaryKey(Integer id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 选择通过主键
     *
     * @param userName userName
     * @return {@link UserInfoDO}
     */
    @Override
    public UserInfoDO selectByUserName(String userName) {
        return userInfoMapper.selectByUserName(userName);
    }

    /**
     * 更新主键的选择性
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int updateByPrimaryKeySelective(UserInfoDO record) {
        return userInfoMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 更新的主键
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int updateByPrimaryKey(UserInfoDO record) {
        return userInfoMapper.updateByPrimaryKey(record);
    }

    /**
     * 批处理更新
     *
     * @param list 列表
     * @return int
     */
    @Override
    public int updateBatch(List<UserInfoDO> list) {
        return userInfoMapper.updateBatch(list);
    }

    /**
     * 更新批选择性
     *
     * @param list 列表
     * @return int
     */
    @Override
    public int updateBatchSelective(List<UserInfoDO> list) {
        return userInfoMapper.updateBatchSelective(list);
    }

    /**
     * 批量插入
     *
     * @param list 列表
     * @return int
     */
    @Override
    public int batchInsert(List<UserInfoDO> list) {
        return userInfoMapper.batchInsert(list);
    }

}
