package com.neuedu.kjds.controller.mvo;

import com.neuedu.kjds.pojo.BrdBrand;
import com.neuedu.kjds.pojo.SysUser;
import com.neuedu.kjds.service.mvo.BrdBrandService;
import com.neuedu.kjds.util.KJDSResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/brd")
public class BrdBrandController {

    @Autowired
    private BrdBrandService brdBrandService;

    //private ImageService imageService;

    //添加品牌
    @RequestMapping("/addBrdBrand")
    @ResponseBody
    public KJDSResult addBrdBrand(@RequestBody BrdBrand brdBrand, HttpSession session){
        System.out.println("测试添加品牌信息controller");
        SysUser loginUser=(SysUser)session.getAttribute("loginuser");
        int manId=loginUser.getManBuyerId();
        brdBrand.setManId(manId);
        brdBrand.setCreatedBy("system");
        brdBrand.setLastUpdateBy("system");
        brdBrand.setCreationDate(new Date());
        brdBrand.setLastUpdateDate(new Date());
        boolean flag = brdBrandService.savebrd(brdBrand);
        if (flag) {
            return KJDSResult.ok();
        } else {
            return KJDSResult.build(500,"添加失败");
        }
    }
    // 更新品牌
    @RequestMapping("/updeteBrdBrand")
    @ResponseBody
    public KJDSResult updeteBrdBrand(@RequestBody BrdBrand brdBrand){
        System.out.println("测试更新品牌controller");
        brdBrand.setCreatedBy("system");
        brdBrand.setLastUpdateBy("system");
        brdBrand.setCreationDate(new Date());
        brdBrand.setLastUpdateDate(new Date());
        boolean flag = brdBrandService.updatebrd(brdBrand);
        if (flag) {
            return KJDSResult.ok();
        } else {
            return KJDSResult.build(500,"更新失败");
        }
    }

    // 删除品牌
    @RequestMapping("/deleteBrdBrand")
    @ResponseBody
    public KJDSResult deleteBrdBrand(@RequestBody BrdBrand brdBrand){
        System.out.println("测试删除品牌controller");
        boolean flag = brdBrandService.deletebrd(brdBrand.getBrdId());
        if (flag) {
            return KJDSResult.ok();
        } else {
            return KJDSResult.build(500,"删除失败");
        }
    }
}
