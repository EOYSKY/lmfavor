package cn.lmsite.lmfavor.mapper;

import cn.lmsite.lmfavor.entity.WebSiteInfoDO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WebSiteInfoMapper {
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
    int insert(WebSiteInfoDO record);

    int insertOrUpdate(WebSiteInfoDO record);

    int insertOrUpdateSelective(WebSiteInfoDO record);

    int insertOrUpdateWithBLOBs(WebSiteInfoDO record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(WebSiteInfoDO record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    WebSiteInfoDO selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(WebSiteInfoDO record);

    int updateByPrimaryKeyWithBLOBs(WebSiteInfoDO record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(WebSiteInfoDO record);

    int updateBatch(List<WebSiteInfoDO> list);

    int updateBatchSelective(List<WebSiteInfoDO> list);

    int batchInsert(@Param("list") List<WebSiteInfoDO> list);
}