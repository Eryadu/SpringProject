package io.pragra.feb2025ioc.BeansAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(io.pragra.feb2025ioc.BeansAnnotation.AppConfig.class);
                                                                        // Package Name +Class Name
       /* MyClass myClass = (MyClass) context.getBean("myBean");
        myClass.display();
        System.out.println(myClass);*/

        // try to print without bean name as used @primary annotation on bean to mark it unique for same class
        MyClass myClass = context.getBean(MyClass.class);
        myClass.display();
        System.out.println(myClass);


        // creating second bean of same class to test @Scope ("prototype")
        MyClass myClass1 = context.getBean(MyClass.class);
        myClass1.display();
        System.out.println(myClass1);
        context.registerShutdownHook();


        // different reference for bean scope("prototype")
        // Property value : SomeValue
        //io.pragra.feb2025ioc.BeansAnnotation.MyClass@60015ef5
        //Property value : SomeValue
        //io.pragra.feb2025ioc.BeansAnnotation.MyClass@2f54a33d


        // same reference for bean scope("singleton")
        /*Property value : SomeValue
        io.pragra.feb2025ioc.BeansAnnotation.MyClass@55f616cf
        Property value : SomeValue
        io.pragra.feb2025ioc.BeansAnnotation.MyClass@55f616cf*/


        /*// creating second bean of same class
        MyClass myClass1 = context.getBean("myBean1",MyClass.class);
        myClass1.display();
        System.out.println(myClass1);*/
    }
}
