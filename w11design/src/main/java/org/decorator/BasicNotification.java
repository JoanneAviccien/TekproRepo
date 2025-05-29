package org.decorator;

import java.util.logging.Logger;

public class BasicNotification implements Notification {
    private static final Logger logger = Logger.getLogger(BasicNotification.class.getName());

    @Override
    public void send(String message) {
        logger.info("Mengirim notifikasi dasar: " + message);
    }
} 