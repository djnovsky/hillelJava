package patterns.factory.pizza;

import patterns.factory.factory.PizzaComponentsFactory;

/**
 * Created by User on 30.05.2016.
 */
public class newYorkMeatPizza extends Pizza {
    public newYorkMeatPizza(PizzaComponentsFactory pizzaComponentsFactory) {
        dough = pizzaComponentsFactory.createDough();
        cheese = pizzaComponentsFactory.createCheese();
        proteins = pizzaComponentsFactory.createProteins();
    }

    @Override
    public void box() {
        System.out.println("Boxing in New York Box");
    }
}
