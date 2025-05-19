package io.pragra.feb2025ioc.AutoWiringSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("AutowiringSpring.xml");
        City city =  context.getBean("city", City.class);
        city.setId(101);
        city.setName("Toronto");
        State state =  context.getBean("state", State.class);
        state.setName("Ontario");
        city.setS(state);
        city.showCityDetails();
        System.out.println(state.getName());

    }
}
