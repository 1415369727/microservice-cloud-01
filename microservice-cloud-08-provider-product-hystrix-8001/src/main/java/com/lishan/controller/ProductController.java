package com.lishan.controller;

import com.lishan.pojo.Product;
import com.lishan.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value  =  "/product/get/{id}",  method  =  RequestMethod.GET)
    public  Product  get(@PathVariable("id")  Long  id) throws Exception  {
        Product product = service.get(id);

        if (product == null) {
            throw new RuntimeException("ID="+id+"无效");
        }
        return  product;
    }
    //当get方法出现异常时，则会调用此方法. 注意此方法的返回值，参数列表与原方法一致
    public Product getFallback(@PathVariable("id") Long id) {
        Product p=new Product();
        p.setPid(id);p.setProductName("无效的数据");
        p.setDbSource("无效的数据库");
        return p;
    }

    @RequestMapping(value  =  "/product/list",  method  =  RequestMethod.GET)
    public List<Product> list() throws Exception  {
        return  service.list();
    }
}
