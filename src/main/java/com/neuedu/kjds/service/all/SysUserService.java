package com.neuedu.kjds.service.all;

import com.neuedu.kjds.pojo.SysUser;

/**
 * 系统用户管理接口
 */
public interface SysUserService {
    //登录login
    public SysUser loginByUsernameAndPassword(String username,String password);
}
