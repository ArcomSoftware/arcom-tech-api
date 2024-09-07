package com.ArcomTech.ApiV1.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class UserNotificationService {

    @Scheduled(cron = "0 * * * * MON-SUN")
    public void sendNotification(){
        System.out.println("enviando........");
    }
}
