package com.neuedu.kjds.service.ddsp.impl;

import com.neuedu.kjds.pojo.DrpDropshipPrice;
import com.neuedu.kjds.mapper.DrpDropshipPriceMapper;
import com.neuedu.kjds.service.ddsp.DrpDropshipPriceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (DrpDropshipPrice)表服务实现类
 *
 * @author makejava
 * @since 2023-07-04 01:35:31
 */
@Service("drpDropshipPriceService")
public class DrpDropshipPriceServiceImpl implements DrpDropshipPriceService {
    @Resource
    private DrpDropshipPriceMapper drpDropshipPriceMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param drpId 主键
     * @return 实例对象
     */
    @Override
    public DrpDropshipPrice queryById(Integer drpId) {
        return this.drpDropshipPriceMapper.queryById(drpId);
    }



    /**
     * 新增数据
     *
     * @param drpDropshipPrice 实例对象
     * @return 实例对象
     */
    @Override
    public DrpDropshipPrice insert(DrpDropshipPrice drpDropshipPrice) {
        this.drpDropshipPriceMapper.insert(drpDropshipPrice);
        return drpDropshipPrice;
    }

    /**
     * 修改数据
     *
     * @param drpDropshipPrice 实例对象
     * @return 实例对象
     */
    @Override
    public DrpDropshipPrice update(DrpDropshipPrice drpDropshipPrice) {
        this.drpDropshipPriceMapper.update(drpDropshipPrice);
        return this.queryById(drpDropshipPrice.getDrpId());
    }

    /**
     * 通过主键删除数据
     *
     * @param drpId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer drpId) {
        return this.drpDropshipPriceMapper.deleteById(drpId) > 0;
    }
}
