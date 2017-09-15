package com.kakasys.dao.mapper.coin;

import com.kakasys.entity.coin.AccountCompany;
import com.kakasys.entity.coin.AccountCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountCompanyMapper {
    int countByExample(AccountCompanyExample example);

    int deleteByExample(AccountCompanyExample example);

    int deleteByPrimaryKey(String id);

    int insert(AccountCompany record);

    int insertSelective(AccountCompany record);

    List<AccountCompany> selectByExample(AccountCompanyExample example);

    AccountCompany selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AccountCompany record, @Param("example") AccountCompanyExample example);

    int updateByExample(@Param("record") AccountCompany record, @Param("example") AccountCompanyExample example);

    int updateByPrimaryKeySelective(AccountCompany record);

    int updateByPrimaryKey(AccountCompany record);
}