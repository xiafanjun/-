package com.neuedu.kjds.service.all;

import com.neuedu.kjds.util.KJDSResult;
import com.neuedu.kjds.vo.NewUser;

import javax.servlet.http.HttpSession;

/**
 * 系统用户管理接口
 */
public interface SysUserService {
    //登录login
    public KJDSResult loginByUsernameAndPassword(String username, String password, String usercode, HttpSession httpSession);

    public KJDSResult register(NewUser newUser, HttpSession session);
}
