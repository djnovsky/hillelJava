package patterns.factory;

/**
 * Created by User on 30.05.2016.
 */
public class PizzaStore {
    public Pizza order(String type) {

        Pizza pizza = createPizza(type);

        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    private Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "Cheese":
                pizza = new CheesePizza();
                break;
            case "Meat":
                pizza = new MeatPizza();
                break;
            default:
                throw new RuntimeException("Unexpected pizza type: " + type
                        + ". Expected Meat or Cheese.");
        }
        return pizza;
    }
}
