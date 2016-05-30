package patterns.factory.factory;

import patterns.factory.pizza.Pizza;
import patterns.factory.pizza.chicagoCheesePizza;
import patterns.factory.pizza.chicagoMeatPizza;

/**
 * Created by User on 30.05.2016.
 */
public class ChPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "Cheese":
                return new chicagoCheesePizza();
            case "Meat":
                return new chicagoMeatPizza();
            default:
                throw new RuntimeException("Unexpected pizza type: " + type
                        + ". Expected Meat or Cheese.");
        }
    }
}
