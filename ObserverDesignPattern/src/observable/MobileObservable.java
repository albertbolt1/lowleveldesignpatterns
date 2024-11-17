package observable;

public class MobileObservable implements  Observable{
    @Override
    public void update() {
        System.out.println("updated on Mobile");
    }
}
