package com.lishan.controller;

import com.lishan.pojo.Product;
import com.lishan.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustorController {
    @Autowired
    private ProductClientService service;
    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product)throws Exception{
        return service.add(product);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public  Product  get(@PathVariable("id")  Long  id) throws Exception {
        return  service.get(id);
    }

    @RequestMapping(value  =  "/consumer/product/list")
    public List<Product> list() throws Exception {
        return  service.list();
    }
}
