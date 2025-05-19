package io.pragra.feb2025ioc.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorldInterface implements InitializingBean, DisposableBean {

    // It is the init() method
    // of our bean and it gets
    // invoked on bean instantiation
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean");
    }

    // This method is invoked
    // just after the container
    // is closed
    @Override
    public void destroy() throws Exception {
        System.out.println("Disposing Bean");
     }

}
