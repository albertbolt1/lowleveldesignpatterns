package observer;

import observable.Observable;

public interface Observer {

    public void add(Observable observable);

    public void remove(Observable observable);

    public void notifySubscribers();


}
