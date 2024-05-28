package model;

import controller.Observer;

import java.util.ArrayList;

public interface Observable {


    void addObserver(Observer arg);

    void removeObserver(Observer arg);

    void notifyObservers(Coche arg);
}
