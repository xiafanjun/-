package com.neuedu.kjds.service.mvo.impl;

import com.github.pagehelper.PageHelper;

import com.neuedu.kjds.mapper.SaoSalesOrderMapper;
import com.neuedu.kjds.service.mvo.OrderManagementService;
import com.neuedu.kjds.util.KJDSResult;
import com.neuedu.kjds.vo.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderManagementServiceImpl implements OrderManagementService {

    @Autowired
    SaoSalesOrderMapper saoSalesOrderMapper;
    @Override
    public KJDSResult getUnpaymentOrder(int size, int current) {
        // PageHelper.startPage(current,size);
        List<OrderDto> orderDtos = saoSalesOrderMapper.selectUnpaymentOrder();
        return KJDSResult.ok(orderDtos);
    }

    @Override
    public KJDSResult getUndeliverOrder(int size, int current) {
        // PageHelper.startPage(current,size);
        List<OrderDto> orderDtos = saoSalesOrderMapper.selectUndeliverOrder();
        return KJDSResult.ok(orderDtos);
    }

    @Override
    public KJDSResult dodeliver(int saoid) {
        // 发货
        boolean b = saoSalesOrderMapper.updateOrderStsBoolean(saoid);
        if (b)
            return KJDSResult.ok();
        else
            return KJDSResult.build(200,"error");
    }
}
