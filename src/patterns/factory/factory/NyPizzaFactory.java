package patterns.factory.factory;

import enums.PizzaType;
import patterns.factory.pizza.Pizza;
import patterns.factory.pizza.newYorkCheesePizza;
import patterns.factory.pizza.newYorkMeatPizza;

/**
 * Created by User on 30.05.2016.
 */
public class NyPizzaFactory implements PizzaFactory {
    PizzaComponentsFactory pizzaComponentsFactory;

    public NyPizzaFactory(PizzaComponentsFactory pizzaComponentsFactory) {
        this.pizzaComponentsFactory = pizzaComponentsFactory;
    }

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case CHEESE:
                pizza = new newYorkCheesePizza(pizzaComponentsFactory);
                return pizza;
            case MEAT:
                pizza = new newYorkMeatPizza(pizzaComponentsFactory);
                return pizza;
            default:
                throw new RuntimeException("Unexpected pizza type: " + type
                        + ". Expected Meat or Cheese.");
        }
    }
}
