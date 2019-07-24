package com.lishan.service;

import com.lishan.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//指定调用的服务 MICROSERVICE-PRODUCT
@FeignClient(value = "MICROSERVICE-PRODUCT",fallback=ProductClientServiceFallBack.class)
public interface ProductClientService {

    @RequestMapping(value  =  "/product/add",  method  =  RequestMethod.POST)
    public  boolean  add(@RequestBody Product  product) throws Exception ;

    @RequestMapping(value  =  "/product/get/{id}",  method  =  RequestMethod.GET)
    public  Product  get(@PathVariable("id")  Long  id) throws Exception ;

    @RequestMapping(value  =  "/product/list",  method  =  RequestMethod.GET)
    public  List<Product>  list() throws Exception;
}
