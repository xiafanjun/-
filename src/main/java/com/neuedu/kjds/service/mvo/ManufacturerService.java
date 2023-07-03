package com.neuedu.kjds.service.mvo;

import java.util.List;

/**
 * 品牌商管理业务接口
 */
public interface ManufacturerService {
    //查询品牌商公司及旗下品牌和品牌图片
    public List<?> queryManufacturerAndBrand(Integer manId);
}
