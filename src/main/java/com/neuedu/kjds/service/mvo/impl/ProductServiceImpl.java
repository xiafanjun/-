package com.neuedu.kjds.service.mvo.impl;

import com.neuedu.kjds.mapper.ProductMapper;
import com.neuedu.kjds.pojo.Product;
import com.neuedu.kjds.service.mvo.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2023-07-03 23:44
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public void addProduct(Product product) {
        productMapper.addProduct(product);
    }

    @Override
    public void deleteProduct(int productId) {

        productMapper.deleteProduct(productId);
    }

    @Override
    public Product getProductById(int productId) {
        return productMapper.getProductById(productId);
    }

    @Override
    public void updateProduct(Product product) {
        productMapper.updateProduct(product);
    }
}
