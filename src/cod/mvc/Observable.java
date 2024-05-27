package cod.mvc;

public interface Observable {
    void addObserver(Observer arg);

    void removeObserver(Observer arg);

    void notifyObservers(Coche arg);
}
