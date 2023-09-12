package Observer;

public interface HomeownerObserver {
    void notify(String message);
    void attach(Observer observer);
    void detach(Observer observer);
}
