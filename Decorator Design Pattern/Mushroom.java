
public class Mushroom extends Toppings{
    
    public BasePizza pizza;

    Mushroom(BasePizza base)
    {
        this.pizza = base;
    }

    public int cost()
    {
        return pizza.cost() + 15;
    }
}
