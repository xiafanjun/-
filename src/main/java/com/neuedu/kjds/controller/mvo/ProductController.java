package com.neuedu.kjds.controller.mvo;

import com.neuedu.kjds.pojo.Product;
import com.neuedu.kjds.service.mvo.ManufacturerService;
import com.neuedu.kjds.service.mvo.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2023-07-03 23:41
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService ProductServiceImpl;

    @RequestMapping("/get/{id}")
    public Product getBrandProduct(@PathVariable("id") int id) {
        return ProductServiceImpl.getProductById(id);
    }

    @RequestMapping("/add")
    public void addBrandProduct(@RequestBody Product product) {
        ProductServiceImpl.addProduct(product);
    }

    @RequestMapping("/update/{id}")
    public void updateBrandProduct(@PathVariable("id") int id, @RequestBody Product product) {
        product.setProId(id);
        ProductServiceImpl.updateProduct(product);
    }

    @RequestMapping("/delete/{id}")
    public void deleteBrandProduct(@PathVariable("id") int id) {
        ProductServiceImpl.deleteProduct(id);
    }
}
