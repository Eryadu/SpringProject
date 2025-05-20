package io.pragra.feb2025ioc.AutoWiringSpring.AutoWiringSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

    public void send(String message) {
        System.out.println("Email sent : " + message);
    }
}

@Component
class SmsService{
    public void send(String message) {
        System.out.println("SMS sent : " + message);
    }
}
