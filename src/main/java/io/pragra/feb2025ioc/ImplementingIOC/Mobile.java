package io.pragra.feb2025ioc.ImplementingIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {

      /*  // Manually Creating Instance of Jio
        ISim sim = new Jio();
        sim.calling();
        sim.data();*/

        /*-----------------------------------------------------------------------------------------------------*/
        // 1. Xml Configuration
        /*// Using ApplicationContext to implement Spring IoC
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("SimXML.xml");

        // Get the Bean of Jio
        ISim iSim = applicationContext.getBean("sim", ISim.class);
        iSim.calling();
        iSim.data();

        // Get the Bean of Airtel
        ISim iSim1 = applicationContext.getBean("sim1", ISim.class);
        iSim1.calling();
        iSim1.data();*/

        //--------------------------------------------------------------------------------------------------
        // 2. Java Configuration based

        // Load the Spring IoC container
        // using Java-based configuration
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // it refers to same instance as by default its singleton design pattern
        ISim airtel = (Airtel) appContext.getBean("airtel"); //  io.pragra.feb2025ioc.ImplementingIOC.Airtel@6a2f6f80
        Airtel airtel2 = (Airtel) appContext.getBean("airtel"); //  io.pragra.feb2025ioc.ImplementingIOC.Airtel@6a2f6f80
        Airtel airtel3 = (Airtel) appContext.getBean("airtel"); // io.pragra.feb2025ioc.ImplementingIOC.Airtel@6a2f6f80
        Airtel airtel4 = (Airtel) appContext.getBean("airtel"); // io.pragra.feb2025ioc.ImplementingIOC.Airtel@6a2f6f80
        airtel.calling();
        airtel.data();
        airtel2.calling();
        airtel3.calling();
        airtel4.calling();
        System.out.println(airtel);
        System.out.println(airtel2);
        System.out.println(airtel3);
        System.out.println(airtel4);

        Jio jio = (Jio) appContext.getBean("jio");
        jio.calling();
        jio.data();
        /*ISim sim = appContext.getBean(ISim.class);
        sim.calling();
        sim.data();*/

    }
}
