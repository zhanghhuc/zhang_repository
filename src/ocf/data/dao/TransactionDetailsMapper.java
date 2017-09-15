package ocf.data.dao;

import java.util.List;
import ocf.data.entity.TransactionDetails;
import ocf.data.entity.TransactionDetailsExample;

public interface TransactionDetailsMapper {
    int countByExample(TransactionDetailsExample example);

    int deleteByExample(TransactionDetailsExample example);

    int deleteByPrimaryKey(String id);

    int insert(TransactionDetails record);

    int insertSelective(TransactionDetails record);

    List<TransactionDetails> selectByExample(TransactionDetailsExample example);

    TransactionDetails selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TransactionDetails record);

    int updateByPrimaryKey(TransactionDetails record);
}