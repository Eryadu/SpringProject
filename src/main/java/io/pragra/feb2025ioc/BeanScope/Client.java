package io.pragra.feb2025ioc.BeanScope;

import io.pragra.feb2025ioc.PropertySourceAndValue.AppInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        // Load the Spring XML configuration
        // file into IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanScope.xml");
        HelloWorld helloWorld1 = context.getBean(HelloWorld.class);
        helloWorld1.setName("Pragra");
        System.out.println(helloWorld1.getName());

        // Get another "HelloWorld" bean object
        // and call getName() method
        HelloWorld helloWorld2 = context.getBean(HelloWorld.class);
        System.out.println(helloWorld2.getName());

        // Get another "HelloWorld" bean object
        // and call getName() method
        HelloWorld helloWorld3 = context.getBean(HelloWorld.class);
        System.out.println(helloWorld3.getName());

        // Now compare the references to see
        // whether they are pointing to the
        // same object or different object
        System.out.println(
                "'helloWorld1' and 'helloWorld2'"
                        + " are referring"
                        + "to the same object: "
                        + (helloWorld1 == helloWorld2));

        // Print the address of both
        // object
        System.out.println(
                "Address of object helloWorld1: "
                        + helloWorld1); //.HelloWorld@47d90b9e same for Singleton bean Scope

        // .HelloWorld@4690b489 different for Prototype bean Scope
        //Address of object helloWorld2: io.pragra.feb2025ioc.BeanScope.HelloWorld@79b06cab
        System.out.println(
                "Address of object helloWorld2: "
                        + helloWorld2); // .HelloWorld@47d90b9e

    }
}
