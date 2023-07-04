package com.neuedu.kjds.service.mvo.impl;

import com.neuedu.kjds.mapper.BrdBrandMapper;
import com.neuedu.kjds.pojo.BrdBrand;
import com.neuedu.kjds.pojo.SysUser;
import com.neuedu.kjds.service.mvo.BrdBrandService;
import com.neuedu.kjds.service.mvo.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private BrdBrandMapper brdBrandMapper;

    @Override
    public boolean saveImage(String brandName, HttpSession session) {
        SysUser loginUser=(SysUser)session.getAttribute("loginuser");
        int manId=loginUser.getManBuyerId();
        BrdBrand brdBrand = new BrdBrand();
        brdBrand.setNameCn(brandName);
        brdBrand.setManId(manId);
        brdBrand.setCreatedBy("system");
        brdBrand.setLastUpdateBy("system");
        brdBrand.setCreationDate(new Date());
        brdBrand.setLastUpdateDate(new Date());
        return brdBrandMapper.insert(brdBrand) == 1;
    }

    @Override
    public boolean updatebrd(BrdBrand brdBrand) {
        return brdBrandMapper.updateByPrimaryKey(brdBrand) == 1;
    }

    @Override
    public boolean deletebrd(Integer brdId) {
        return brdBrandMapper.deleteByPrimaryKey(brdId) == 1;
    }
}
