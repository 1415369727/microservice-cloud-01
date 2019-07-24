package com.lishan.controller;

import com.lishan.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CustorController {
    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX="http://microservice-product";
    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product)throws Exception{
        return restTemplate.postForObject(REST_URL_PREFIX+"/product/add", product, Boolean.class);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public  Product  get(@PathVariable("id")  Long  id) throws Exception {
        return  restTemplate.getForObject(REST_URL_PREFIX  +  "/product/get/"  +  id, Product.class);
    }

    @RequestMapping(value  =  "/consumer/product/list")
    public List<Product> list() throws Exception {
        return  restTemplate.getForObject(REST_URL_PREFIX  +  "/product/list", List.class);
    }
}
