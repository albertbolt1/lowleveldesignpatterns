public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();

        Shape shape = factory.creator("SQUARE");
        Shape shape1= factory.creator("CIRCLE");

        shape.draw();
        shape1.draw();
    }
}