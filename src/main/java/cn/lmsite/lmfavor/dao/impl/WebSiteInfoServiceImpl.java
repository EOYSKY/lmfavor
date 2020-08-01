package cn.lmsite.lmfavor.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.lmsite.lmfavor.dao.WebSiteInfoService;
import cn.lmsite.lmfavor.entity.WebSiteInfoDO;
import cn.lmsite.lmfavor.mapper.WebSiteInfoMapper;
import org.springframework.stereotype.Service;

/**
 * impl网站信息服务
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
@Service
public class WebSiteInfoServiceImpl implements WebSiteInfoService{

    /** 网站信息映射器 */
    @Resource
    private WebSiteInfoMapper webSiteInfoMapper;

    /**
     * 按主键删除
     *
     * @param id id
     * @return int
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return webSiteInfoMapper.deleteByPrimaryKey(id);
    }

    /**
     * 插入
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int insert(WebSiteInfoDO record) {
        return webSiteInfoMapper.insert(record);
    }

    /**
     * 插入或更新
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int insertOrUpdate(WebSiteInfoDO record) {
        return webSiteInfoMapper.insertOrUpdate(record);
    }

    /**
     * 插入或更新选择性
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int insertOrUpdateSelective(WebSiteInfoDO record) {
        return webSiteInfoMapper.insertOrUpdateSelective(record);
    }

    /**
     * 插入或更新blob
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int insertOrUpdateWithBLOBs(WebSiteInfoDO record) {
        return webSiteInfoMapper.insertOrUpdateWithBLOBs(record);
    }

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int insertSelective(WebSiteInfoDO record) {
        return webSiteInfoMapper.insertSelective(record);
    }

    /**
     * 选择通过主键
     *
     * @param id id
     * @return {@link WebSiteInfoDO}
     */
    @Override
    public WebSiteInfoDO selectByPrimaryKey(Integer id) {
        return webSiteInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新主键的选择性
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int updateByPrimaryKeySelective(WebSiteInfoDO record) {
        return webSiteInfoMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 更新通过主键blob
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int updateByPrimaryKeyWithBLOBs(WebSiteInfoDO record) {
        return webSiteInfoMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    /**
     * 更新的主键
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int updateByPrimaryKey(WebSiteInfoDO record) {
        return webSiteInfoMapper.updateByPrimaryKey(record);
    }

    /**
     * 批处理更新
     *
     * @param list 列表
     * @return int
     */
    @Override
    public int updateBatch(List<WebSiteInfoDO> list) {
        return webSiteInfoMapper.updateBatch(list);
    }

    /**
     * 更新批选择性
     *
     * @param list 列表
     * @return int
     */
    @Override
    public int updateBatchSelective(List<WebSiteInfoDO> list) {
        return webSiteInfoMapper.updateBatchSelective(list);
    }

    /**
     * 批量插入
     *
     * @param list 列表
     * @return int
     */
    @Override
    public int batchInsert(List<WebSiteInfoDO> list) {
        return webSiteInfoMapper.batchInsert(list);
    }

}
