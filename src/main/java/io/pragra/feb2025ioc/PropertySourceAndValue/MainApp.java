package io.pragra.feb2025ioc.PropertySourceAndValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PropertyConfig.class);
        AppInfo appInfo = context.getBean(AppInfo.class);
        System.out.println("Application name : " + appInfo.getAppName() + "  " + " version : " + appInfo.getAppVersion());
        context.close();
    }
}
