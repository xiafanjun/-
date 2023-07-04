package com.neuedu.kjds.mapper;

import com.neuedu.kjds.pojo.ProProduct;
import com.neuedu.kjds.pojo.ProProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProProductMapper {
    int countByExample(ProProductExample example);

    int deleteByExample(ProProductExample example);

    int deleteByPrimaryKey(Integer proId);

    int insert(ProProduct record);

    int insertSelective(ProProduct record);

    List<ProProduct> selectByExampleWithBLOBs(ProProductExample example);

    List<ProProduct> selectByExample(ProProductExample example);

    ProProduct selectByPrimaryKey(Integer proId);

    int updateByExampleSelective(@Param("record") ProProduct record, @Param("example") ProProductExample example);

    int updateByExampleWithBLOBs(@Param("record") ProProduct record, @Param("example") ProProductExample example);

    int updateByExample(@Param("record") ProProduct record, @Param("example") ProProductExample example);

    int updateByPrimaryKeySelective(ProProduct record);

    int updateByPrimaryKeyWithBLOBs(ProProduct record);

    int updateByPrimaryKey(ProProduct record);
}