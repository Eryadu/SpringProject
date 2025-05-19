package io.pragra.feb2025ioc.BeanLifeCycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        // Configuration by XML
        // Loading the Spring XML configuration
        // file into the spring container and
        // it will create the instance of
        // the bean as it loads into container
       ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("HelloWorld.xml");



        // It will close the spring container
        // and as a result invokes the
        // destroy() method
       context.close();
        //context.registerShutdownHook();

//-------------------------------------------------------------------------------------------------------
        // Configuration by Interface
        // Loading the Spring XML configuration
        // file into the spring container and
        // it will create the instance of the bean
        // as it loads into container
      ConfigurableApplicationContext context2 = new ClassPathXmlApplicationContext("HelloWorldInterface.xml");

        // It will close the spring container
        // and as a result invokes the
        // destroy() method
       context2.close();

        //-------------------------------------------------------------------------------------------------------
        // Configuration by Annotation
        // Loading the Spring XML configuration
        // file into the spring container and
        // it will create the instance of the bean
        // as it loads into container
        ConfigurableApplicationContext context3 = new ClassPathXmlApplicationContext("HelloWorldAnnotation.xml");

        // It will close the spring container
        // and as a result invokes the
        // destroy() method
        context3.close();


    }
}
