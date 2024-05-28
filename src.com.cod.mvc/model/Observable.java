package model;

import controller.Observer;

public interface Observable {
    void addObserver(Observer arg);

    void removeObserver(Observer arg);

    void notifyObservers(Coche arg);
}
