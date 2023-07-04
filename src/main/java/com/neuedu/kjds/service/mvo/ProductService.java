package com.neuedu.kjds.service.mvo;

import com.neuedu.kjds.pojo.Product;

/**
 * @author shkstart
 * @create 2023-07-03 23:44
 */
public interface ProductService {
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
