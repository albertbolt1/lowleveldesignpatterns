public class CheesePizza extends BasePizza{

    public BasePizza basePizza;

    CheesePizza(BasePizza basePizza)
    {
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+50;
    }

}
