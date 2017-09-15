package ocf.dao;

import java.util.List;
import ocf.entity.BannerMC;
import ocf.entity.BannerMCExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerMCMapper {
    int countByExample(BannerMCExample example);

    int deleteByExample(BannerMCExample example);

    int deleteByPrimaryKey(Integer bannerId);

    int insert(BannerMC record);

    int insertSelective(BannerMC record);

    List<BannerMC> selectByExample(BannerMCExample example);

    BannerMC selectByPrimaryKey(Integer bannerId);

    int updateByExampleSelective(@Param("record") BannerMC record, @Param("example") BannerMCExample example);

    int updateByExample(@Param("record") BannerMC record, @Param("example") BannerMCExample example);

    int updateByPrimaryKeySelective(BannerMC record);

    int updateByPrimaryKey(BannerMC record);
}