package io.pragra.feb2025ioc.BeanLifeCycle;

// By using XML Configuration
public class HelloWorldXML {

    public void init(){
        System.out.println("Bean HelloWorld has been instantiated, and I'm the init() method");
    }

    public void destroy(){
        System.out.println("Bean HelloWorld has been destroyed, and I'm the destroy() method");
    }



}
