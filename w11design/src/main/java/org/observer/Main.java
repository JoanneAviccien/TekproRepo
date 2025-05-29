package org.observer;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");
        NewsChannel channel3 = new NewsChannel("Channel 3");

        logger.info("\n=== Mendaftarkan Channel ===");
        newsAgency.registerObserver(channel1);
        newsAgency.registerObserver(channel2);
        newsAgency.registerObserver(channel3);

        logger.info("\n=== Menerbitkan Berita Pertama ===");
        newsAgency.setNews("Gempa bumi terjadi di Jakarta");

        logger.info("\n=== Menghapus Channel 2 ===");
        newsAgency.removeObserver(channel2);

        logger.info("\n=== Menerbitkan Berita Kedua ===");
        newsAgency.setNews("Hujan lebat di Bandung");

        logger.info("\n=== Mendaftarkan Channel Baru ===");
        NewsChannel channel4 = new NewsChannel("Channel 4");
        newsAgency.registerObserver(channel4);

        logger.info("\n=== Menerbitkan Berita Ketiga ===");
        newsAgency.setNews("Kebakaran di Surabaya");
    }
} 