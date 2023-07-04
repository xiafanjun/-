package com.neuedu.kjds.service.mvo;

import com.neuedu.kjds.pojo.ManManufacturer;

import java.util.List;

/**
 * 品牌商管理业务接口
 */
public interface ManufacturerService {
    //查询品牌商公司及旗下品牌和品牌图片
    public List<?> queryManufacturerAndBrand(Integer manId);
    //添加品牌商公司信息
    public boolean save(ManManufacturer manManufacturer);
    //更新品牌商公司信息
    public boolean update(ManManufacturer manManufacturer);
    //删除品牌商公司信息
    public boolean delete(Integer manId);
}
