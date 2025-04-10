

public class ClientCode {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new VegPizza()));

        System.out.println(pizza.cost());
    }
}
