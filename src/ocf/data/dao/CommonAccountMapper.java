package ocf.data.dao;

import java.util.List;
import ocf.data.entity.CommonAccount;
import ocf.data.entity.CommonAccountExample;
import org.apache.ibatis.annotations.Param;

public interface CommonAccountMapper {
    int countByExample(CommonAccountExample example);

    int deleteByExample(CommonAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(CommonAccount record);

    int insertSelective(CommonAccount record);

    List<CommonAccount> selectByExample(CommonAccountExample example);

    CommonAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CommonAccount record, @Param("example") CommonAccountExample example);

    int updateByExample(@Param("record") CommonAccount record, @Param("example") CommonAccountExample example);

    int updateByPrimaryKeySelective(CommonAccount record);

    int updateByPrimaryKey(CommonAccount record);
}