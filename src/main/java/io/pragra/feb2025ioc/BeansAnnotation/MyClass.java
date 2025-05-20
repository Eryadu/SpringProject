package io.pragra.feb2025ioc.BeansAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component // This makes Spring automatically detect and register this bean with ID "myBean"
public class MyClass {
    private String propertyName;

    // Setter
    public void setPropertyName(String propertyName){
        this.propertyName = propertyName;
    }

    public void display(){
        System.out.println("Property value : " + propertyName);
    }
}
