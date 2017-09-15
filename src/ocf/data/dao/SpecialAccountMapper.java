package ocf.data.dao;

import java.util.List;
import ocf.data.entity.SpecialAccount;
import ocf.data.entity.SpecialAccountExample;
import org.apache.ibatis.annotations.Param;

public interface SpecialAccountMapper {
    int countByExample(SpecialAccountExample example);

    int deleteByExample(SpecialAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(SpecialAccount record);

    int insertSelective(SpecialAccount record);

    List<SpecialAccount> selectByExample(SpecialAccountExample example);

    SpecialAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SpecialAccount record, @Param("example") SpecialAccountExample example);

    int updateByExample(@Param("record") SpecialAccount record, @Param("example") SpecialAccountExample example);

    int updateByPrimaryKeySelective(SpecialAccount record);

    int updateByPrimaryKey(SpecialAccount record);
}