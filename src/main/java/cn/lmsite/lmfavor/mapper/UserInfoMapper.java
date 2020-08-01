package cn.lmsite.lmfavor.mapper;

import java.util.List;

import cn.lmsite.lmfavor.entity.UserInfoDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 用户信息映射器
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
@Mapper
public interface UserInfoMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
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
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(UserInfoDO record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    UserInfoDO selectByPrimaryKey(Integer id);

    /**
     * select by userName
     *
     * @param userName userName
     * @return object by userName
     */
    UserInfoDO selectByUserName(String userName);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UserInfoDO record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
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
    int batchInsert(@Param("list") List<UserInfoDO> list);
}