package observer;

import observable.Observable;

import java.util.ArrayList;
import java.util.List;

public class ScoreNotifyObserver implements  Observer{

    List<Observable> observableList= new ArrayList<>();


    int score = 10;
    @Override
    public void add(Observable observable) {
        observableList.add(observable);

    }

    @Override
    public void remove(Observable observable) {
        observableList.remove(observable);
    }

    @Override
    public void notifySubscribers() {
        for(Observable observable:observableList)
        {
            observable.update();
        }
    }

    public void setScore(int score)
    {
        this.score=score;
        this.notifySubscribers();
    }
}
