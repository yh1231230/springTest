package com.myspring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 常用的三种注解
 * @Component("")
 * @Autowired
 * @Resource(name="")
 */


import javax.annotation.Resource;
@Component("product")
public class Product {
    private int id;
    private String name="product";
    @Autowired
    private Category category;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    @Resource(name = "category")
    public void setCategory(Category category) {
        this.category = category;
    }


}
