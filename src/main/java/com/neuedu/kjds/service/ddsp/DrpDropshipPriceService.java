package com.neuedu.kjds.service.ddsp;

import com.neuedu.kjds.pojo.DrpDropshipPrice;


/**
 * (DrpDropshipPrice)表服务接口
 *
 * @author makejava
 * @since 2023-07-04 01:35:30
 */
public interface DrpDropshipPriceService {

    /**
     * 通过ID查询单条数据
     *
     * @param drpId 主键
     * @return 实例对象
     */
    DrpDropshipPrice queryById(Integer drpId);


    /**
     * 新增数据
     *
     * @param drpDropshipPrice 实例对象
     * @return 实例对象
     */
    DrpDropshipPrice insert(DrpDropshipPrice drpDropshipPrice);

    /**
     * 修改数据
     *
     * @param drpDropshipPrice 实例对象
     * @return 实例对象
     */
    DrpDropshipPrice update(DrpDropshipPrice drpDropshipPrice);

    /**
     * 通过主键删除数据
     *
     * @param drpId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer drpId);

}
