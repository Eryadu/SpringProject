package io.pragra.feb2025ioc.BeansAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan ("io.pragra.feb2025ioc.BeansAnnotation")
public class AppConfig {

    @Bean
    public MyClass myBean(){
        MyClass obj = new MyClass();
        obj.setPropertyName("SomeValue");
        return obj;
    }
}
