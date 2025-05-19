package io.pragra.feb2025ioc.SpringBootAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan

public class DemoApplication {

    public static void main(String[] args) {

        //Annotation based spring Context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("io.pragra.feb2025ioc.SpringBootAnnotation");
        context.refresh();

        //Getting bean from the Component class
        ComponentDemo componentDemo = context.getBean(ComponentDemo.class);
        componentDemo.display();

        context.close();

    }
}
