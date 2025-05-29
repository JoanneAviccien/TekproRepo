package org.decorator;

import java.util.logging.Logger;

public class PushNotification extends NotificationDecorator {
    private static final Logger logger = Logger.getLogger(PushNotification.class.getName());
    private String deviceId;

    public PushNotification(Notification notification, String deviceId) {
        super(notification);
        this.deviceId = deviceId;
    }

    @Override
    public void send(String message) {
        super.send(message);
        logger.info("Mengirim push notification ke device " + deviceId + ": " + message);
    }
} 