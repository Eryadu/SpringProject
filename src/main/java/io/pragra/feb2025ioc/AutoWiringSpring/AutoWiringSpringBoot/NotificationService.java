package io.pragra.feb2025ioc.AutoWiringSpring.AutoWiringSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class NotificationService {

    private final EmailService emailService;
    private final SmsService smsService;

    @Autowired
    public NotificationService(@Qualifier ("emailService") EmailService emailService, @Qualifier ("smsService") SmsService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void notify(String msg){
        emailService.send(msg);
        smsService.send(msg);
    }

}
