package io.pragra.feb2025ioc.AutoWiringSpring.AutoWiringSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class NotificationService {

    private final EmailService emailService;
    private SmsService smsService;

    //Constructor D-injection
    @Autowired
    public NotificationService( EmailService emailService) {
        this.emailService = emailService;
    }

    // Setter D-injection
    @Autowired
    public void setSmsService(SmsService smsService) {
        this.smsService=smsService;
    }
    public void notify(String msg){
        emailService.send(msg);
        smsService.send(msg);
    }

}
