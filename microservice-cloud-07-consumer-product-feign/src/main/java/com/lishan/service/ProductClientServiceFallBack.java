package com.lishan.service;

import com.lishan.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductClientServiceFallBack implements ProductClientService{

    @Override
    public boolean add(Product product) throws Exception {
        return false;
    }

    @Override
    public Product get(Long id) throws Exception {
        System.out.println("哈哈哈");
        Product p=new Product();
        p.setPid(id);p.setProductName("测试没有了");p.setDbSource("数据库不存在的");
        return p;
    }

    @Override
    public List<Product> list() throws Exception {
        return null;
    }
}
