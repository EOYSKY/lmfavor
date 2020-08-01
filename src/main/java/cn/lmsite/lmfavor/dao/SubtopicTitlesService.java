package cn.lmsite.lmfavor.dao;

import java.util.List;
import cn.lmsite.lmfavor.entity.SubtopicTitlesDO;

/**
 * 小标题标题服务
 *
 * @author jonny
 */
public interface SubtopicTitlesService{

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
    int insert(SubtopicTitlesDO record);

    /**
     * 插入或更新
     *
     * @param record 记录
     * @return int
     */
    int insertOrUpdate(SubtopicTitlesDO record);

    /**
     * 插入或更新选择性
     *
     * @param record 记录
     * @return int
     */
    int insertOrUpdateSelective(SubtopicTitlesDO record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */
    int insertSelective(SubtopicTitlesDO record);

    /**
     * 选择通过主键
     *
     * @param id id
     * @return {@link SubtopicTitlesDO}
     */
    SubtopicTitlesDO selectByPrimaryKey(Integer id);

    /**
     * 更新主键的选择性
     *
     * @param record 记录
     * @return int
     */
    int updateByPrimaryKeySelective(SubtopicTitlesDO record);

    /**
     * 更新的主键
     *
     * @param record 记录
     * @return int
     */
    int updateByPrimaryKey(SubtopicTitlesDO record);

    /**
     * 批处理更新
     *
     * @param list 列表
     * @return int
     */
    int updateBatch(List<SubtopicTitlesDO> list);

    /**
     * 更新批选择性
     *
     * @param list 列表
     * @return int
     */
    int updateBatchSelective(List<SubtopicTitlesDO> list);

    /**
     * 批量插入
     *
     * @param list 列表
     * @return int
     */
    int batchInsert(List<SubtopicTitlesDO> list);

}
