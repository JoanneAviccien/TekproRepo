package org.observer;

public interface NewsSubject {
    void registerObserver(NewsObserver observer);
    void removeObserver(NewsObserver observer);
    void notifyObservers();
} 