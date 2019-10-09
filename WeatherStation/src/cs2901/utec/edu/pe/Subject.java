package cs2901.utec.edu.pe;

public interface Subject {
    Observer observers [] = new Observer[4];
    void registerObserver(Observer observer, int i);
    void removeObserver();
    void notifyObservers();
}
