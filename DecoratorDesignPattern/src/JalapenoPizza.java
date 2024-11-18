public class JalapenoPizza extends  BasePizza{

    public BasePizza basePizza;

    JalapenoPizza(BasePizza basePizza)
    {
        this.basePizza=basePizza;
    }

    @Override
    public int cost()
    {
        return basePizza.cost()+100;
    }
}
