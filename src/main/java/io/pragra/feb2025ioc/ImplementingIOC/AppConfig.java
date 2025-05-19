package io.pragra.feb2025ioc.ImplementingIOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = "io.pragra.feb2025ioc")
// @Configuration : We  can also create beans without @Configuration annotation by passing class name.
public class AppConfig {


    /*@Bean

    public ISim iSim(){
        return new Airtel();
    }*/


    @Bean
    public Airtel airtel() {
        return new Airtel();
    }

    @Bean
    public Jio jio(){
        return new Jio();
    }

}
