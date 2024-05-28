package model;

import controller.Observer;

import java.util.ArrayList;

public interface Observable {

    public static ArrayList<Coche> parking = new ArrayList<>();

    public static ArrayList<Observer> observers = new ArrayList<>();

    void addObserver(Observer arg);

    void removeObserver(Observer arg);

    void notifyObservers(Coche arg);
}
