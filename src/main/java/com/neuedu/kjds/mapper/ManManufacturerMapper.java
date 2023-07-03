package com.neuedu.kjds.mapper;

import com.neuedu.kjds.pojo.ManManufacturer;
import com.neuedu.kjds.pojo.ManManufacturerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManManufacturerMapper {
    int countByExample(ManManufacturerExample example);

    int deleteByExample(ManManufacturerExample example);

    int deleteByPrimaryKey(Integer manId);

    int insert(ManManufacturer record);

    int insertSelective(ManManufacturer record);

    List<ManManufacturer> selectByExampleWithBLOBs(ManManufacturerExample example);

    List<ManManufacturer> selectByExample(ManManufacturerExample example);

    ManManufacturer selectByPrimaryKey(Integer manId);

    int updateByExampleSelective(@Param("record") ManManufacturer record, @Param("example") ManManufacturerExample example);

    int updateByExampleWithBLOBs(@Param("record") ManManufacturer record, @Param("example") ManManufacturerExample example);

    int updateByExample(@Param("record") ManManufacturer record, @Param("example") ManManufacturerExample example);

    int updateByPrimaryKeySelective(ManManufacturer record);

    int updateByPrimaryKeyWithBLOBs(ManManufacturer record);

    /**
     * 根据品牌商公司id查询公司信息及其下的品牌信息
     * @param manId
     * @return
     */
    List<?> selectManufacturerAndBrand(Integer manId);
}