package com.neuedu.kjds.controller.all;

import com.neuedu.kjds.pojo.SysUser;
import com.neuedu.kjds.service.all.SysUserService;
import com.neuedu.kjds.util.KJDSResult;
import com.neuedu.kjds.vo.NewUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/sysUser")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/login")
    @ResponseBody
    public KJDSResult login(@RequestBody NewUser newUser, HttpSession session){
        return sysUserService.loginByUsernameAndPassword(newUser.getUsername(),newUser.getPassword(),newUser.getCode(),session);
    }
    @RequestMapping("/loginuser")
    @ResponseBody
    public KJDSResult loginUser(HttpSession session){
        SysUser loginUser=(SysUser)session.getAttribute("loginuser");
        if(loginUser!=null){
            return new KJDSResult(loginUser);
        }else{
            return KJDSResult.build(500,"对不起你没登录");
        }
    }

    @RequestMapping("/register")
    @ResponseBody
    public KJDSResult registerUser(@RequestBody NewUser newUser,HttpSession httpSession){
        return sysUserService.register(newUser,httpSession);
    }
}
