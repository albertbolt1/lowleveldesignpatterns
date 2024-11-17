package observable;

public class TabletObservable implements  Observable{
    @Override
    public void update() {
        System.out.println("Updated on Tablet");
    }
}
