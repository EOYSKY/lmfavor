package cn.lmsite.lmfavor.mapper;

import cn.lmsite.lmfavor.entity.SidebarNavSubjectsDO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SidebarNavSubjectsMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(SidebarNavSubjectsDO record);

    int insertOrUpdate(SidebarNavSubjectsDO record);

    int insertOrUpdateSelective(SidebarNavSubjectsDO record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SidebarNavSubjectsDO record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SidebarNavSubjectsDO selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SidebarNavSubjectsDO record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SidebarNavSubjectsDO record);

    int updateBatch(List<SidebarNavSubjectsDO> list);

    int updateBatchSelective(List<SidebarNavSubjectsDO> list);

    int batchInsert(@Param("list") List<SidebarNavSubjectsDO> list);
}