package cn.lmsite.lmfavor.dao;

import java.util.List;

import cn.lmsite.lmfavor.entity.SidebarNavSubjectsDO;

/**
 * 侧边栏导航对象服务
 *
 * @author jonny
 */
public interface SidebarNavSubjectsService {

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
    int insert(SidebarNavSubjectsDO record);

    /**
     * 插入或更新
     *
     * @param record 记录
     * @return int
     */
    int insertOrUpdate(SidebarNavSubjectsDO record);

    /**
     * 插入或更新选择性
     *
     * @param record 记录
     * @return int
     */
    int insertOrUpdateSelective(SidebarNavSubjectsDO record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */
    int insertSelective(SidebarNavSubjectsDO record);

    /**
     * 选择通过主键
     *
     * @param id id
     * @return {@link SidebarNavSubjectsDO}
     */
    SidebarNavSubjectsDO selectByPrimaryKey(Integer id);

    /**
     * 更新主键的选择性
     *
     * @param record 记录
     * @return int
     */
    int updateByPrimaryKeySelective(SidebarNavSubjectsDO record);

    /**
     * 更新的主键
     *
     * @param record 记录
     * @return int
     */
    int updateByPrimaryKey(SidebarNavSubjectsDO record);

    /**
     * 批处理更新
     *
     * @param list 列表
     * @return int
     */
    int updateBatch(List<SidebarNavSubjectsDO> list);

    /**
     * 更新批选择性
     *
     * @param list 列表
     * @return int
     */
    int updateBatchSelective(List<SidebarNavSubjectsDO> list);

    /**
     * 批量插入
     *
     * @param list 列表
     * @return int
     */
    int batchInsert(List<SidebarNavSubjectsDO> list);

}
