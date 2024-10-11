package com.malkoc.strategyPattern.strategy;

import com.malkoc.strategyPattern.strategy.enums.NotificationType;

public interface NotificationStrategy {
    void sendMessage(String message);
    NotificationType notificationType();
}
