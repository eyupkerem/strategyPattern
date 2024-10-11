package com.malkoc.strategyPattern.controller;

import com.malkoc.strategyPattern.strategy.NotificationContext;
import com.malkoc.strategyPattern.strategy.enums.NotificationType;
import com.malkoc.strategyPattern.strategy.exception.NotFoundNotificationStrategy;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class NotificationController {
    private final NotificationContext notificationContext;

    @GetMapping
    public String sendNotification(@RequestParam String message,
                                   @RequestParam NotificationType notificationType) throws NotFoundNotificationStrategy {
        notificationContext.sendMessage(message, notificationType);
        return message;
    }
}