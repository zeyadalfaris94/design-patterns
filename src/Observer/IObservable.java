package Observer;

import java.util.ArrayList;
import java.util.List;

public interface IObservable {
    List<IObserver> observers = new ArrayList<>();
    void notifyUsers();
    void add(IObserver observer);
    void remove(IObserver observer);
}
