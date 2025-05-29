package org.observer;

import java.util.logging.Logger;

public class NewsChannel implements NewsObserver {
    private static final Logger logger = Logger.getLogger(NewsChannel.class.getName());
    private String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        logger.info(name + " menerima berita: " + news);
    }
} 