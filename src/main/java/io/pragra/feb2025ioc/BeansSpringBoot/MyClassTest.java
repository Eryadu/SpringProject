package io.pragra.feb2025ioc.BeansSpringBoot;

import org.springframework.stereotype.Component;

@Component("myBeanTest") // Register this as a Spring bean with ID "myBean"
public class MyClassTest {
    private String propertyName;

    public MyClassTest(){
        this.propertyName = "SomeValue";
    }

    public void display(){
        System.out.println("Property value : " + propertyName);
    }
}
