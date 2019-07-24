package com.lishan.service;

import com.lishan.pojo.Product;

import java.util.List;

public interface ProductService {
    public boolean add(Product product)throws Exception;
    public Product get(Long id)throws Exception;
    public List<Product> list()throws Exception;
}
