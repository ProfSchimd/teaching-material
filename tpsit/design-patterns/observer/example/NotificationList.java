import java.util.ArrayList;

public class NotificationList implements ISubject {

    private ArrayList<IObserver> observers;
    private Object state;

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);        
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for(IObserver observer : observers) {
            observer.updateFrom(this);
        }
    }

    public void setState(Object newState) {
        state = newState;
        notifyObservers();
    }

    public Object getState() {
        return state;
    }

}