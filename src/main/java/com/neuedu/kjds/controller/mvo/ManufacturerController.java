package com.neuedu.kjds.controller.mvo;

import com.neuedu.kjds.pojo.SysUser;
import com.neuedu.kjds.service.mvo.ManufacturerService;
import com.neuedu.kjds.util.KJDSResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
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
    public KJDSResult getManfacturerAndBrand(HttpSession session){
        SysUser loginUser=(SysUser)session.getAttribute("loginuser");
        int manId=loginUser.getManBuyerId();
        List<?> list=manufacturerService.queryManufacturerAndBrand(manId);
        if(list!=null && list.size()>0){
            return new KJDSResult(list);
        }else{
            return KJDSResult.build(500,"查询品牌数据错误");
        }
    }

}
