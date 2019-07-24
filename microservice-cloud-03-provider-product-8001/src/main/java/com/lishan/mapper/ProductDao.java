package com.lishan.mapper;

import com.lishan.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ProductDao {
    public Product findById(Long  pid)throws Exception;

    public List<Product> findAll()throws Exception;

    public boolean  addProduct(Product  product)throws Exception;
}
