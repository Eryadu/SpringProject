package io.pragra.feb2025ioc.BeansAnnotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan ("io.pragra.feb2025ioc")
public class AppConfig {

    @Bean (initMethod = "init", destroyMethod = "destroy")
   // @Primary
    //@Scope("singleton")
   // @Scope("prototype")
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

