package io.pragra.feb2025ioc.BeanLifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class HelloWorldAnnotation {

    // Annotate this method to execute it
    // automatically as the bean is
    // instantiated
        @PostConstruct
        public void init() throws Exception{
            System.out.println("Bean HelloWorld has been instantiated and I'm the "
                    + "init() method");
        }

    // Annotate this method to execute it
    // when Spring container is closed
        @PreDestroy
        public void destroy() throws Exception{
            System.out.println("Bean HelloWorld has been destroyed and I'm the " +
                    "destroy() method");
        }
}
