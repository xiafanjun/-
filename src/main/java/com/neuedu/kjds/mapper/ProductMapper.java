package com.neuedu.kjds.mapper;

import com.neuedu.kjds.pojo.Product;
import com.neuedu.kjds.pojo.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    /**
     * 增加商品
     * @param product
     */
    void addProduct(Product product);

    /**
     * 删除商品
     * @param productId
     */
    void deleteProduct(int productId);

    /**
     * 获取商品信息
     * @param productId
     * @return
     */
    Product getProductById(int productId);

    /**
     * 更新商品信息
     * @param product
     */
    void updateProduct(Product product);

}