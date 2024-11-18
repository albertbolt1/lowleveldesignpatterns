public class Main {
    public static void main(String[] args) {

        BasePizza basePizza = new CheesePizza(new JalapenoPizza(new MushroomPizza()));

        System.out.println(basePizza.cost());
    }
}