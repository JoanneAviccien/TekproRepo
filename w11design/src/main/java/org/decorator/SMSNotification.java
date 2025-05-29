package org.decorator;

import java.util.logging.Logger;

public class SMSNotification extends NotificationDecorator {
    private static final Logger logger = Logger.getLogger(SMSNotification.class.getName());
    private String phoneNumber;

    public SMSNotification(Notification notification, String phoneNumber) {
        super(notification);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) {
        super.send(message);
        logger.info("Mengirim SMS ke " + phoneNumber + ": " + message);
    }
} 