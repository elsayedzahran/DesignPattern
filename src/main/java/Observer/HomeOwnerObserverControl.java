package Observer;

import java.util.ArrayList;
import java.util.List;

// Observer Pattern: Concrete Sensor with Observer
public class HomeOwnerObserverControl implements HomeownerObserver {

    List<Observer> observers;
    public HomeOwnerObserverControl() {
        observers = new ArrayList<>();
    }


    @Override
    public void notify(String message) {
        for (Observer observer : observers){
            observer.update(message);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }
}
