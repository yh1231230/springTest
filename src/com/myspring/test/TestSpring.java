package com.myspring.test;

import com.myspring.pojo.Category;
import com.myspring.pojo.Product;
import com.myspring.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        Product d = (Product) context.getBean("product");
        System.out.println(d.getName());
        System.out.println(d.getCategory().getName());

        Category c=(Category) context.getBean("category");
        System.out.println(c.getName());



        ProductService s=(ProductService) context.getBean("a");
        s.runService();
    }
}
