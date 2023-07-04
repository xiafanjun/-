package com.neuedu.kjds.service.mvo.impl;

import com.neuedu.kjds.mapper.ManManufacturerMapper;
import com.neuedu.kjds.pojo.ManManufacturer;
import com.neuedu.kjds.service.mvo.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {
    @Autowired
    private ManManufacturerMapper manManufacturerMapper;

    /**
     * 查询品牌商公司信息及旗下的所有品牌和品牌图片
     */
    @Override
    public List<?> queryManufacturerAndBrand(Integer manId) {
        return manManufacturerMapper.selectManufacturerAndBrand(manId);
    }

    @Override
    public boolean save(ManManufacturer manManufacturer) {
        return manManufacturerMapper.insert(manManufacturer) == 1;
    }

    @Override
    public boolean update(ManManufacturer manManufacturer) {
        return manManufacturerMapper.updateByPrimaryKeySelective(manManufacturer) == 1;
    }

    @Override
    public boolean delete(Integer manId) {
        return manManufacturerMapper.deleteByPrimaryKey(manId) == 1;
    }
}
