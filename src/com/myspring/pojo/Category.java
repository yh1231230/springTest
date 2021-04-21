package com.myspring.pojo;

import org.springframework.stereotype.Component;
//告诉spring容器这是个Bean叫做”category“,
//等价于<bean id="category" class="com.myspring.pojo.Category"></bean>
@Component("category")
public class Category {
    private int id;
    private String name="category";

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
}
