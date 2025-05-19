package io.pragra.feb2025ioc.AutoWiringSpring.AutoWiringSpringBoot;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService {

    public void send(String message) {
        System.out.println("Email sent : " + message);
    }
}

@Component("smsService")
class SmsService{
    public void send(String message) {
        System.out.println("SMS sent : " + message);
    }
}
