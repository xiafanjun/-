package com.neuedu.kjds.service.mvo;

import com.neuedu.kjds.pojo.BrdBrand;
import org.springframework.stereotype.Service;

@Service
public interface BrdBrandService {
    //添加品牌
    public boolean savebrd(BrdBrand brdBrand);
    //更新品牌
    public boolean updatebrd(BrdBrand brdBrand);
    //删除品牌
    public boolean deletebrd(Integer brdId);
}
