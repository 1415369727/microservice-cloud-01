package com.lishan.controller;

import com.lishan.pojo.Product;
import com.lishan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @RequestMapping(value  =  "/product/add",  method  =  RequestMethod.POST)
    public  boolean  add(@RequestBody Product product) throws Exception  {
        return  service.add(product);
    }

    @RequestMapping(value  =  "/product/get/{id}",  method  =  RequestMethod.GET)
    public  Product  get(@PathVariable("id")  Long  id) throws Exception  {
        return  service.get(id);
    }

    @RequestMapping(value  =  "/product/list",  method  =  RequestMethod.GET)
    public List<Product> list() throws Exception  {
        return  service.list();
    }
}
