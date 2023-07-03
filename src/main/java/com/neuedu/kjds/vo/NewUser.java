package com.neuedu.kjds.vo;

import com.neuedu.kjds.pojo.SysUser;
/**
 * 参数绑定中间vo对象，值对象 NewUser
 * @author weijuan
 *
 */
public class NewUser extends SysUser {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
