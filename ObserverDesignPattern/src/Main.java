import observable.MobileObservable;
import observable.TabletObservable;
import observer.ScoreNotifyObserver;

public class Main {
    public static void main(String[] args) {

        ScoreNotifyObserver scoreNotifyObserver= new ScoreNotifyObserver();
        scoreNotifyObserver.add(new MobileObservable());
        scoreNotifyObserver.add(new TabletObservable());
        scoreNotifyObserver.setScore(20);
    }
}