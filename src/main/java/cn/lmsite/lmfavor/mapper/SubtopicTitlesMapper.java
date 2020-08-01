package cn.lmsite.lmfavor.mapper;

import java.util.List;

import cn.lmsite.lmfavor.entity.SubtopicTitlesDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SubtopicTitlesMapper {
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
    int insert(SubtopicTitlesDO record);

    int insertOrUpdate(SubtopicTitlesDO record);

    int insertOrUpdateSelective(SubtopicTitlesDO record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SubtopicTitlesDO record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    SubtopicTitlesDO selectByPrimaryKey(Integer id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SubtopicTitlesDO record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SubtopicTitlesDO record);

    int updateBatch(List<SubtopicTitlesDO> list);

    int updateBatchSelective(List<SubtopicTitlesDO> list);

    int batchInsert(@Param("list") List<SubtopicTitlesDO> list);
}