package io.pragra.feb2025ioc.BeansXMLTesting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        //Load Spring configuration from XML file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the Bean by its ID
        MyClass myClass = (MyClass) context.getBean("myBean");

        // Use the bean
        myClass.display();
    }
}
