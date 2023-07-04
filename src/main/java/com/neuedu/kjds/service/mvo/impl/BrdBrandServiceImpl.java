package com.neuedu.kjds.service.mvo.impl;

import com.neuedu.kjds.mapper.BrdBrandMapper;
import com.neuedu.kjds.pojo.BrdBrand;
import com.neuedu.kjds.pojo.SysUser;
import com.neuedu.kjds.service.mvo.BrdBrandService;
//import com.neuedu.kjds.service.mvo.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Service
public class BrdBrandServiceImpl implements BrdBrandService {

    @Autowired
    private BrdBrandMapper brdBrandMapper;

    //private ImageService imageService;

    @Override
    public boolean savebrd(BrdBrand brdBrand) {

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
