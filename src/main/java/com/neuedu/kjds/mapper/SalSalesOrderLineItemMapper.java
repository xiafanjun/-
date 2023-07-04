package com.neuedu.kjds.mapper;

import com.neuedu.kjds.pojo.SalSalesOrderLineItem;
import com.neuedu.kjds.pojo.SalSalesOrderLineItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SalSalesOrderLineItemMapper {
    int countByExample(SalSalesOrderLineItemExample example);

    int deleteByExample(SalSalesOrderLineItemExample example);

    int deleteByPrimaryKey(Integer salId);

    int insert(SalSalesOrderLineItem record);

    int insertSelective(SalSalesOrderLineItem record);

    List<SalSalesOrderLineItem> selectByExample(SalSalesOrderLineItemExample example);

    SalSalesOrderLineItem selectByPrimaryKey(Integer salId);

    int updateByExampleSelective(@Param("record") SalSalesOrderLineItem record, @Param("example") SalSalesOrderLineItemExample example);

    int updateByExample(@Param("record") SalSalesOrderLineItem record, @Param("example") SalSalesOrderLineItemExample example);

    int updateByPrimaryKeySelective(SalSalesOrderLineItem record);

    int updateByPrimaryKey(SalSalesOrderLineItem record);
}