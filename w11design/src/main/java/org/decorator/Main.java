package org.decorator;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    
    private static final String EMAIL_ADDRESS = "user@example.com";
    private static final String PHONE_NUMBER = "08123456789";
    private static final String DEVICE_ID = "DEVICE123";
    private static final String BASIC_MESSAGE = "Pesan dasar";
    private static final String EMAIL_MESSAGE = "Pesan dengan email";
    private static final String SMS_MESSAGE = "Pesan dengan SMS";
    private static final String PUSH_MESSAGE = "Pesan dengan push notification";
    private static final String COMBINED_MESSAGE = "Pesan dengan email dan SMS";
    private static final String FULL_MESSAGE = "Pesan dengan semua jenis notifikasi";

    public static void main(String[] args) {
        Notification basicNotification = new BasicNotification();
        
        logger.info("\n=== Notifikasi Dasar ===");
        basicNotification.send(BASIC_MESSAGE);
        
        logger.info("\n=== Notifikasi dengan Email ===");
        Notification emailNotification = new EmailNotification(basicNotification, EMAIL_ADDRESS);
        emailNotification.send(EMAIL_MESSAGE);
        
        logger.info("\n=== Notifikasi dengan SMS ===");
        Notification smsNotification = new SMSNotification(basicNotification, PHONE_NUMBER);
        smsNotification.send(SMS_MESSAGE);
        
        logger.info("\n=== Notifikasi dengan Push ===");
        Notification pushNotification = new PushNotification(basicNotification, DEVICE_ID);
        pushNotification.send(PUSH_MESSAGE);
        
        logger.info("\n=== Notifikasi Kombinasi (Email + SMS) ===");
        Notification combinedNotification = new SMSNotification(
            new EmailNotification(basicNotification, EMAIL_ADDRESS),
            PHONE_NUMBER
        );
        combinedNotification.send(COMBINED_MESSAGE);
        
        logger.info("\n=== Notifikasi Lengkap (Email + SMS + Push) ===");
        Notification fullNotification = new PushNotification(
            new SMSNotification(
                new EmailNotification(basicNotification, EMAIL_ADDRESS),
                PHONE_NUMBER
            ),
            DEVICE_ID
        );
        fullNotification.send(FULL_MESSAGE);
    }
}