package org.dexter.dependencyInjection;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(Order order) {
        // email notification logic
    }
}
