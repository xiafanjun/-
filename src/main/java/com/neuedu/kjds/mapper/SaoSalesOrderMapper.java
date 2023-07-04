package com.neuedu.kjds.mapper;

import com.neuedu.kjds.pojo.SaoSalesOrder;
import com.neuedu.kjds.pojo.SaoSalesOrderExample;
import com.neuedu.kjds.vo.OrderDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaoSalesOrderMapper {
    int countByExample(SaoSalesOrderExample example);

    int deleteByExample(SaoSalesOrderExample example);

    int deleteByPrimaryKey(Integer saoId);

    int insert(SaoSalesOrder record);

    int insertSelective(SaoSalesOrder record);

    List<SaoSalesOrder> selectByExampleWithBLOBs(SaoSalesOrderExample example);

    List<SaoSalesOrder> selectByExample(SaoSalesOrderExample example);

    SaoSalesOrder selectByPrimaryKey(Integer saoId);

    int updateByExampleSelective(@Param("record") SaoSalesOrder record, @Param("example") SaoSalesOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") SaoSalesOrder record, @Param("example") SaoSalesOrderExample example);

    int updateByExample(@Param("record") SaoSalesOrder record, @Param("example") SaoSalesOrderExample example);

    int updateByPrimaryKeySelective(SaoSalesOrder record);

    int updateByPrimaryKeyWithBLOBs(SaoSalesOrder record);

    int updateByPrimaryKey(SaoSalesOrder record);

    List<OrderDto> selectUnpaymentOrder();

    List<OrderDto> selectUndeliverOrder();

    boolean updateOrderStsBoolean(@Param("SAO_ID") int saoid);
}