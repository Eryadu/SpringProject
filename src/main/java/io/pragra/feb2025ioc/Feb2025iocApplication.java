package io.pragra.feb2025ioc;

import io.pragra.feb2025ioc.BeansSpringBoot.MyClassTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = {"io.pragra.feb2025ioc", "Engine"}) // test how to scan from other packages as well for beans
public class Feb2025iocApplication  {

	@Autowired
	private MyClassTest myBeanTest;

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Feb2025iocApplication.class, args);
		/*ApplicationContext context = new AnnotationConfigApplicationContext(MainClass.class);
		Car car = context.getBean(Car.class);
		car.drive();*/

		MyClassTest myBeanTest = context.getBean(MyClassTest.class);
		myBeanTest.display();
	}

}
