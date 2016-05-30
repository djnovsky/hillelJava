package patterns.factory.factory;

import enums.PizzaType;
import patterns.factory.pizza.Pizza;
import patterns.factory.pizza.chicagoCheesePizza;
import patterns.factory.pizza.chicagoMeatPizza;
import patterns.factory.pizza.ingredients.cheese.Parmejano;
import patterns.factory.pizza.ingredients.dough.Thick;
import patterns.factory.pizza.ingredients.proteins.Meat;

/**
 * Created by User on 30.05.2016.
 */
public class ChPizzaFactory implements PizzaFactory {
    PizzaComponentsFactory pizzaComponentsFactory;

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case CHEESE:
                pizza = new chicagoCheesePizza(pizzaComponentsFactory);
                return pizza;
            case MEAT:
                pizza = new chicagoMeatPizza(pizzaComponentsFactory);
                return pizza;
            default:
                throw new RuntimeException("Unexpected pizza type: " + type
                        + ". Expected Meat or Cheese.");
        }
    }
}
