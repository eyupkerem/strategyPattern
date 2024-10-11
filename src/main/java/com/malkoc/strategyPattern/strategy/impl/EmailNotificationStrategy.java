package com.malkoc.strategyPattern.strategy.impl;

import com.malkoc.strategyPattern.strategy.NotificationStrategy;
import com.malkoc.strategyPattern.strategy.enums.NotificationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmailNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendMessage(String message) {
        log.info("Email operations");
        log.info("Email sent to user");
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
