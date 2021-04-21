package com.myspring.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component("s")
@Service("a")
public class ProductService {
    public void runService(){
        System.out.println("进行业务逻辑");
    }
}
