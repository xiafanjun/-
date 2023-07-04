package com.neuedu.kjds.controller.ddsp;

import com.neuedu.kjds.pojo.DrpDropshipPrice;

import com.neuedu.kjds.service.ddsp.DrpDropshipPriceService;
import com.neuedu.kjds.util.KJDSResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drpDropshipPrice")
public class DrpDropshipPriceController {

    /**
     * 服务对象
     */
    @Autowired
    private DrpDropshipPriceService drpDropshipPriceService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("/query/{id}")
    public KJDSResult queryById(@PathVariable("id") Integer id) {
        DrpDropshipPrice drpDropshipPrice = drpDropshipPriceService.queryById(id);
        return KJDSResult.ok(drpDropshipPrice);
    }

    /**
     * 新增数据
     *
     * @param drpDropshipPrice 实体
     * @return 新增结果
     */
    @RequestMapping("/insert")
    public KJDSResult add(@RequestBody DrpDropshipPrice drpDropshipPrice) {
        drpDropshipPriceService.insert(drpDropshipPrice);
        return KJDSResult.ok();
    }

    /**
     * 编辑数据
     *
     * @param drpDropshipPrice 实体
     * @return 编辑结果
     */
    @RequestMapping("/update")
    public KJDSResult edit(@RequestBody DrpDropshipPrice drpDropshipPrice) {
        drpDropshipPriceService.update(drpDropshipPrice);
        return KJDSResult.ok();

    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @RequestMapping("/delete/{id}")
    public KJDSResult deleteById(@PathVariable("id") Integer id) {
        drpDropshipPriceService.deleteById(id);
        return KJDSResult.ok();
    }

}
