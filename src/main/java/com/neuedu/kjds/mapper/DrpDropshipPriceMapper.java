package com.neuedu.kjds.mapper;


import com.neuedu.kjds.pojo.DrpDropshipPrice;

/**
 * (DrpDropshipPrice)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-04 01:35:27
 */
public interface DrpDropshipPriceMapper {

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
     * @return 影响行数
     */
    int insert(DrpDropshipPrice drpDropshipPrice);



    /**
     * 修改数据
     *
     * @param drpDropshipPrice 实例对象
     * @return 影响行数
     */
    int update(DrpDropshipPrice drpDropshipPrice);

    /**
     * 通过主键删除数据
     *
     * @param drpId 主键
     * @return 影响行数
     */
    int deleteById(Integer drpId);

}

