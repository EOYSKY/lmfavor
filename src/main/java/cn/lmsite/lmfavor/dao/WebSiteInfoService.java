package cn.lmsite.lmfavor.dao;

import java.util.List;

import cn.lmsite.lmfavor.entity.WebSiteInfoDO;

/**
 * 网站信息服务
 *
 * @author jonny
 */
public interface WebSiteInfoService {

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
    int insert(WebSiteInfoDO record);

    /**
     * 插入或更新
     *
     * @param record 记录
     * @return int
     */
    int insertOrUpdate(WebSiteInfoDO record);

    /**
     * 插入或更新选择性
     *
     * @param record 记录
     * @return int
     */
    int insertOrUpdateSelective(WebSiteInfoDO record);

    /**
     * 插入或更新blob
     *
     * @param record 记录
     * @return int
     */
    int insertOrUpdateWithBLOBs(WebSiteInfoDO record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */
    int insertSelective(WebSiteInfoDO record);

    /**
     * 选择通过主键
     *
     * @param id id
     * @return {@link WebSiteInfoDO}
     */
    WebSiteInfoDO selectByPrimaryKey(Integer id);

    /**
     * 更新主键的选择性
     *
     * @param record 记录
     * @return int
     */
    int updateByPrimaryKeySelective(WebSiteInfoDO record);

    /**
     * 更新通过主键blob
     *
     * @param record 记录
     * @return int
     */
    int updateByPrimaryKeyWithBLOBs(WebSiteInfoDO record);

    /**
     * 更新的主键
     *
     * @param record 记录
     * @return int
     */
    int updateByPrimaryKey(WebSiteInfoDO record);

    /**
     * 批处理更新
     *
     * @param list 列表
     * @return int
     */
    int updateBatch(List<WebSiteInfoDO> list);

    /**
     * 更新批选择性
     *
     * @param list 列表
     * @return int
     */
    int updateBatchSelective(List<WebSiteInfoDO> list);

    /**
     * 批量插入
     *
     * @param list 列表
     * @return int
     */
    int batchInsert(List<WebSiteInfoDO> list);

}
