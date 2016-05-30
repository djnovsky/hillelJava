package patterns.factory.factory;

import patterns.factory.pizza.Pizza;
import patterns.factory.pizza.newYorkCheesePizza;
import patterns.factory.pizza.newYorkMeatPizza;

/**
 * Created by User on 30.05.2016.
 */
public class NyPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "Cheese":
                return new newYorkCheesePizza();
            case "Meat":
                return new newYorkMeatPizza();
            default:
                throw new RuntimeException("Unexpected pizza type: " + type
                        + ". Expected Meat or Cheese.");
        }
    }
}
