package io.pragra.feb2025ioc.BeansXMLTesting;

public class MyClass {
    private String propertyName;

    //Setter Method ( used by Spring to inject the value)
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public void display(){
        System.out.println("Property value : " +  propertyName);
    }
}
