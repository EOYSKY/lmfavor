package cn.lmsite.lmfavor.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.lmsite.lmfavor.dao.SidebarNavSubjectsService;
import cn.lmsite.lmfavor.entity.SidebarNavSubjectsDO;
import cn.lmsite.lmfavor.mapper.SidebarNavSubjectsMapper;
import org.springframework.stereotype.Service;

/**
 * 侧边栏导航impl主题服务
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
@Service
public class SidebarNavSubjectsServiceImpl implements SidebarNavSubjectsService{

    /** 侧边栏导航对象映射器 */
    @Resource
    private SidebarNavSubjectsMapper sidebarNavSubjectsMapper;

    /**
     * 按主键删除
     *
     * @param id id
     * @return int
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sidebarNavSubjectsMapper.deleteByPrimaryKey(id);
    }

    /**
     * 插入
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int insert(SidebarNavSubjectsDO record) {
        return sidebarNavSubjectsMapper.insert(record);
    }

    /**
     * 插入或更新
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int insertOrUpdate(SidebarNavSubjectsDO record) {
        return sidebarNavSubjectsMapper.insertOrUpdate(record);
    }

    /**
     * 插入或更新选择性
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int insertOrUpdateSelective(SidebarNavSubjectsDO record) {
        return sidebarNavSubjectsMapper.insertOrUpdateSelective(record);
    }

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int insertSelective(SidebarNavSubjectsDO record) {
        return sidebarNavSubjectsMapper.insertSelective(record);
    }

    /**
     * 选择通过主键
     *
     * @param id id
     * @return {@link SidebarNavSubjectsDO}
     */
    @Override
    public SidebarNavSubjectsDO selectByPrimaryKey(Integer id) {
        return sidebarNavSubjectsMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新主键的选择性
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int updateByPrimaryKeySelective(SidebarNavSubjectsDO record) {
        return sidebarNavSubjectsMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 更新的主键
     *
     * @param record 记录
     * @return int
     */
    @Override
    public int updateByPrimaryKey(SidebarNavSubjectsDO record) {
        return sidebarNavSubjectsMapper.updateByPrimaryKey(record);
    }

    /**
     * 批处理更新
     *
     * @param list 列表
     * @return int
     */
    @Override
    public int updateBatch(List<SidebarNavSubjectsDO> list) {
        return sidebarNavSubjectsMapper.updateBatch(list);
    }

    /**
     * 更新批选择性
     *
     * @param list 列表
     * @return int
     */
    @Override
    public int updateBatchSelective(List<SidebarNavSubjectsDO> list) {
        return sidebarNavSubjectsMapper.updateBatchSelective(list);
    }

    /**
     * 批量插入
     *
     * @param list 列表
     * @return int
     */
    @Override
    public int batchInsert(List<SidebarNavSubjectsDO> list) {
        return sidebarNavSubjectsMapper.batchInsert(list);
    }

}
