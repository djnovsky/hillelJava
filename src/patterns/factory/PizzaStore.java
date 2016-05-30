package patterns.factory;

import patterns.factory.factory.PizzaFactory;
import patterns.factory.pizza.Pizza;

/**
 * Created by User on 30.05.2016.
 */
public class PizzaStore {
    PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza order(String type) {

        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

   }

