package io.pragra.feb2025ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = {"io.pragra.feb2025ioc", "Engine"}) // test how to scan from other packages as well for beans
public class Feb2025iocApplication {

	public static void main(String[] args) {
		SpringApplication.run(Feb2025iocApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(MainClass.class);
		Car car = context.getBean(Car.class);
		car.drive();
	}

}
