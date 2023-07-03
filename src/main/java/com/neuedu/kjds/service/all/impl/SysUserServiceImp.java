package com.neuedu.kjds.service.all.impl;

import com.neuedu.kjds.mapper.SysUserMapper;
import com.neuedu.kjds.pojo.SysUser;
import com.neuedu.kjds.pojo.SysUserExample;
import com.neuedu.kjds.service.all.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public SysUser loginByUsernameAndPassword(String username, String password) {
        //创建SysUserExample对象
        SysUserExample example=new SysUserExample();
        SysUserExample.Criteria criteria =example.createCriteria();
        //设置查询条件
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        //根据条件查询
        List<SysUser> lists=sysUserMapper.selectByExample(example);
        if(lists.size()>0){
            return lists.get(0);
        }
        return null;
    }
}
