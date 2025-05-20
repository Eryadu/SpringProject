package io.pragra.feb2025ioc.BeansAnnotation;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan ("io.pragra.feb2025ioc.BeansAnnotation")
public class AppConfig {

    @Bean
   // @Primary
    //@Scope("singleton")
    @Scope("prototype")
    public MyClass myBean() {
        MyClass obj = new MyClass();
        obj.setPropertyName("SomeValue");
        return obj;
    }

    /*@Bean
    public MyClass myBean1() {
        MyClass obj = new MyClass();
        obj.setPropertyName("SomeValue1");
        return obj;*/
    }

