package com.neuedu.kjds.controller.mvo;

import com.neuedu.kjds.pojo.ManManufacturer;
import com.neuedu.kjds.pojo.SysUser;
import com.neuedu.kjds.service.mvo.ManufacturerService;
import com.neuedu.kjds.util.KJDSResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/mvo")
public class ManufacturerController {

    @Autowired
    private ManufacturerService manufacturerService;
    /**
     * 根据会话中登录用户的公司id查询公司及品牌
     */
    @RequestMapping("/getmanfacturerandbrand")
    @ResponseBody
    public KJDSResult getManfacturerAndBrand(HttpSession session){
        System.out.println("测试查询品牌controller");
        SysUser loginUser=(SysUser)session.getAttribute("loginuser");
        int manId=loginUser.getManBuyerId();
        System.out.println(manId);
        List<?> list=manufacturerService.queryManufacturerAndBrand(manId);
        if(list!=null && list.size()>0){
            System.out.println(list);
            return new KJDSResult(list);
        }else{
            return KJDSResult.build(500,"查询品牌数据错误");
        }
    }

    /**
     * 新增品牌商信息
     */
    @RequestMapping("/addmanfacturer")
    @ResponseBody
    public KJDSResult addmanfacturer(@RequestBody ManManufacturer manManufacturer){
        System.out.println("测试添加品牌商信息controller");
        manManufacturer.setStsCd("A");
        manManufacturer.setCreatedBy("system");
        manManufacturer.setCreationDate(new Date());
        manManufacturer.setLastUpdateBy("system");
        manManufacturer.setLastUpdateDate(new Date());
        boolean flag = manufacturerService.save(manManufacturer);
        if (flag) {
            return KJDSResult.ok();
        } else {
            return KJDSResult.build(500,"添加品牌商信息错误");
        }
    }

    /**
     * 修改品牌商信息
     */
    @RequestMapping("/updatemanfacturer")
    @ResponseBody
    public KJDSResult updatemanfacturer(@RequestBody ManManufacturer manManufacturer){
        System.out.println("测试修改品牌商信息controller");
        manManufacturer.setLastUpdateDate(new Date());
        boolean flag = manufacturerService.update(manManufacturer);
        if (flag) {
            return KJDSResult.ok();
        } else {
            return KJDSResult.build(500,"修改品牌商信息错误");
        }
    }

    /**
     * 删除品牌商信息
     */
    @RequestMapping("/deletemanfacturer")
    @ResponseBody
    public KJDSResult deletemanfacturer(HttpSession session){
        System.out.println("测试删除品牌信息controller");
        SysUser loginUser=(SysUser)session.getAttribute("loginuser");
        int manId=loginUser.getManBuyerId();
        boolean flag = manufacturerService.delete(manId);
        if (flag) {
            return KJDSResult.ok();
        } else {
            return KJDSResult.build(500,"删除品牌商信息错误");
        }
    }
}
