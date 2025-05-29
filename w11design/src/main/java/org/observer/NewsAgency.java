package org.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class NewsAgency implements NewsSubject {
    private static final Logger logger = Logger.getLogger(NewsAgency.class.getName());
    private List<NewsObserver> observers;
    private String news;

    public NewsAgency() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(NewsObserver observer) {
        observers.add(observer);
        logger.info("Observer baru terdaftar: " + observer.getClass().getSimpleName());
    }

    @Override
    public void removeObserver(NewsObserver observer) {
        observers.remove(observer);
        logger.info("Observer dihapus: " + observer.getClass().getSimpleName());
    }

    @Override
    public void notifyObservers() {
        for (NewsObserver observer : observers) {
            observer.update(news);
        }
    }

    public void setNews(String news) {
        this.news = news;
        logger.info("Berita baru diterbitkan: " + news);
        notifyObservers();
    }
} 