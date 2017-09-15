package ocf.data.dao;

import java.util.List;
import ocf.data.entity.BudgeAccount;
import ocf.data.entity.BudgeAccountExample;
import org.apache.ibatis.annotations.Param;

public interface BudgeAccountMapper {
    int countByExample(BudgeAccountExample example);

    int deleteByExample(BudgeAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(BudgeAccount record);

    int insertSelective(BudgeAccount record);

    List<BudgeAccount> selectByExample(BudgeAccountExample example);

    BudgeAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BudgeAccount record, @Param("example") BudgeAccountExample example);

    int updateByExample(@Param("record") BudgeAccount record, @Param("example") BudgeAccountExample example);

    int updateByPrimaryKeySelective(BudgeAccount record);

    int updateByPrimaryKey(BudgeAccount record);
}