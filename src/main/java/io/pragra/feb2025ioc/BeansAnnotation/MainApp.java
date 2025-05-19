package io.pragra.feb2025ioc.BeansAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(io.pragra.feb2025ioc.BeansAnnotation.AppConfig.class);
                                                                        // Package Name +Class Name
        MyClass myClass = (MyClass) context.getBean("myBean");
        myClass.display();

    }
}
