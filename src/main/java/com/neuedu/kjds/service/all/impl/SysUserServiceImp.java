package com.neuedu.kjds.service.all.impl;

import com.neuedu.kjds.mapper.SysUserMapper;
import com.neuedu.kjds.pojo.SysUser;
import com.neuedu.kjds.pojo.SysUserExample;
import com.neuedu.kjds.service.all.SysUserService;
import com.neuedu.kjds.util.CMd5;
import com.neuedu.kjds.util.KJDSResult;
import com.neuedu.kjds.vo.NewUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * 系统用户管理实现类
 */
@Service
public class SysUserServiceImp implements SysUserService {
    //注入SysUserMapper
    @Autowired
    private SysUserMapper sysUserMapper;

    //登录功能
    @Override
    public KJDSResult loginByUsernameAndPassword(String username, String password, String checkcode, HttpSession session) {
        String serverCode = (String)session.getAttribute("code");
        String userCode = checkcode.toLowerCase().trim();
        if (serverCode != null && serverCode.toLowerCase().equals(userCode)){ // 验证码正确
            session.removeAttribute("code");
            //创建SysUserExample对象
            SysUserExample example=new SysUserExample();
            SysUserExample.Criteria criteria =example.createCriteria();
            //设置查询条件
            criteria.andUsernameEqualTo(username);
            String encryptPassword = CMd5.encrypt(password);
            criteria.andPasswordEqualTo(encryptPassword);
            //根据条件查询
            List<SysUser> lists=sysUserMapper.selectByExample(example);
            if(lists.size()>0){
                SysUser sysUser = lists.get(0);
                // 将用户信息村session
                session.setAttribute("loginuser",sysUser);
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String lasttime = LocalDateTime.now().format(dateTimeFormatter);
                // 更新最后登录时间
                sysUserMapper.updateLastLoginTime(sysUser.getUserId(),lasttime);
                return KJDSResult.ok();
            }
            return KJDSResult.build(500, "用户名和密码错误登录失败");
        }else {
            return KJDSResult.build(500,"验证码错误");
        }
    }

    @Override
    public KJDSResult register(NewUser newUser, HttpSession session) {
        String serverCode = (String)session.getAttribute("code");
        String userCode = newUser.getCode().toLowerCase().trim();
        if (serverCode != null && serverCode.toLowerCase().equals(userCode)){ // 验证码正确
            session.removeAttribute("code");
            if (isExist(newUser.getUsername())) {
                return KJDSResult.build(500,"用户名已存在");
            }
            String password = newUser.getPassword();
            String encryptPassword = CMd5.encrypt(password);
            newUser.setPassword(encryptPassword);
            sysUserMapper.insert(newUser);
            return KJDSResult.ok();
        }else {
            return KJDSResult.build(500,"验证码错误");
        }
    }

    public  boolean isExist(String username){
        return sysUserMapper.isExistByUsername(username) > 0;
    }
}
