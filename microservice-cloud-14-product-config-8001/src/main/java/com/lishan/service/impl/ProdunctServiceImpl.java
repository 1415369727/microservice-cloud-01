package com.lishan.service.impl;

import com.lishan.mapper.ProductDao;
import com.lishan.pojo.Product;
import com.lishan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdunctServiceImpl implements ProductService {
    @Autowired
  private ProductDao productDao;
    @Override
    public boolean add(Product product) throws Exception {
        return productDao.addProduct(product);
    }

    @Override
    public Product get(Long id) throws Exception {
        return productDao.findById(id);
    }

    @Override
    public List<Product> list() throws Exception {
        return productDao.findAll();
    }
}
