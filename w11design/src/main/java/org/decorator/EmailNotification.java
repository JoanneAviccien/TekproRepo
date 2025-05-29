package org.decorator;

import java.util.logging.Logger;

public class EmailNotification extends NotificationDecorator {
    private static final Logger logger = Logger.getLogger(EmailNotification.class.getName());
    private String emailAddress;

    public EmailNotification(Notification notification, String emailAddress) {
        super(notification);
        this.emailAddress = emailAddress;
    }

    @Override
    public void send(String message) {
        super.send(message);
        logger.info("Mengirim email ke " + emailAddress + ": " + message);
    }
} 