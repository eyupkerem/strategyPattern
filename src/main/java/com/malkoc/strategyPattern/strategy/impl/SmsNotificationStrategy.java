package com.malkoc.strategyPattern.strategy.impl;

import com.malkoc.strategyPattern.strategy.NotificationStrategy;
import com.malkoc.strategyPattern.strategy.enums.NotificationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SmsNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendMessage(String message) {
        log.info("Sms operations");
        log.info("Sms sent to user");
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }
}
