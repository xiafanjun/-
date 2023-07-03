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
        //验证码验证的逻辑
        //从session中取出之前生成的验证码
        String sessioncode=(String)session.getAttribute("code");
        //取出请求中发来的验证码
        String reqcode=newUser.getCode();
        //判断验证码是否正确
        if(sessioncode.equals(reqcode)){//验证码正确-通过验证
            session.removeAttribute("code");
            //登录验证逻辑
            SysUser loginUser=sysUserService.loginByUsernameAndPassword(newUser.getUsername(),newUser.getPassword());
            if(loginUser!=null){//登录成功，那么将登录用户存入session中
                session.setAttribute("loginuser",loginUser);
                return new KJDSResult(loginUser);
            }else{//登录失败
                return KJDSResult.build(500, "用户名和密码错误登录失败");
            }
        }else{//验证码不通过
            session.removeAttribute("code");
            return KJDSResult.build(500, "验证码错误，请重新登录");
        }
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
}
