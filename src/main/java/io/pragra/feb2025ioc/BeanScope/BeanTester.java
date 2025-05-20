package io.pragra.feb2025ioc.BeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class BeanTester {

    @Autowired
    private ApplicationContext context;

    public void testScope(){
        System.out.println("Testing Singleton Scope :");
        SingletonBean sBean1 = context.getBean(SingletonBean.class);
        SingletonBean sBean2 = context.getBean(SingletonBean.class);
        System.out.println("sBean1 == sBean2" + (sBean1 == sBean2));



        System.out.println("\nTesting Prototype Scope :");
        PrototypeBean pBean1 = context.getBean(PrototypeBean.class);
        PrototypeBean pBean2 = context.getBean(PrototypeBean.class);
        System.out.println("pBean1 == pBean2" + (pBean1 == pBean2));

        // Output
        /*Testing Singleton Scope :
        sBean1 == sBean2true

        Testing Prototype Scope :
        PrototypeBean createdio.pragra.feb2025ioc.BeanScope.PrototypeBean@76b47204
        PrototypeBean createdio.pragra.feb2025ioc.BeanScope.PrototypeBean@161aa04a
        pBean1 == pBean2false*/

    }
}
