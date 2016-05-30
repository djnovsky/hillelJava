package patterns.factory.pizza;

import patterns.factory.factory.PizzaComponentsFactory;

/**
 * Created by User on 30.05.2016.
 */
public class chicagoMeatPizza extends Pizza {
    public chicagoMeatPizza(PizzaComponentsFactory pizzaComponentsFactory) {
        cheese = pizzaComponentsFactory.createCheese();
        proteins = pizzaComponentsFactory.createProteins();
        dough = pizzaComponentsFactory.createDough();
    }

    @Override
    public void box(){
        System.out.println("Boxing in Chicago Box");
    }
}
