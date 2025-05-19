package io.pragra.feb2025ioc.ImplementingIOC;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class Airtel implements ISim{
    @Override
    public void calling() {
        System.out.println("Airtel Calling. . ");
    }

    @Override
    public void data() {
        System.out.println("Airtel Data. .");
    }
}

 class Jio implements ISim{
    @Override
    public void calling() {
        System.out.println("Jio Calling. . ");
    }

    @Override
    public void data() {
        System.out.println("Jio Data. .");
    }
 }