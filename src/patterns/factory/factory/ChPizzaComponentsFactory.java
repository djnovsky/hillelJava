package patterns.factory.factory;

import patterns.factory.factory.PizzaComponentsFactory;
import patterns.factory.pizza.ingredients.cheese.Cheese;
import patterns.factory.pizza.ingredients.cheese.Parmejano;
import patterns.factory.pizza.ingredients.dough.Dough;
import patterns.factory.pizza.ingredients.dough.Thick;
import patterns.factory.pizza.ingredients.proteins.Meat;
import patterns.factory.pizza.ingredients.proteins.Proteins;

/**
 * Created by User on 30.05.2016.
 */
public class ChPizzaComponentsFactory implements PizzaComponentsFactory {
    @Override
    public Cheese createCheese() {
        return new Parmejano();
    }

    @Override
    public Dough createDough() {
        return new Thick();
    }

    @Override
    public Proteins createProteins() {
        return new Meat();
    }
}
