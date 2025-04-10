

public class ExtraCheese extends Toppings {
    
    public BasePizza pizza;

    ExtraCheese(BasePizza base)
    {
        this.pizza = base;
    }

    public int cost()
    {
        return pizza.cost() + 10;
    }
}
