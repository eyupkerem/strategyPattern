package com.malkoc.strategyPattern.strategy.impl;

import com.malkoc.strategyPattern.strategy.NotificationStrategy;
import com.malkoc.strategyPattern.strategy.enums.NotificationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SiteNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendMessage(String message) {
        log.info("Site notification operations");
        log.info("Site notificaton sent to user");
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SITE;
    }
}
