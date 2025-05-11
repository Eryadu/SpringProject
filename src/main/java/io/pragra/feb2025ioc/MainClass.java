package io.pragra.feb2025ioc;

import Engine.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainClass {

    @Bean
    public Engine engine(){
        return new Engine();
    }

    @Bean
    public Car car(){
       return new Car(engine());
    }
}
