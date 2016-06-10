package patterns.factory.factory;

import patterns.factory.pizza.ingredients.cheese.Cheese;
import patterns.factory.pizza.ingredients.cheese.Mozarella;
import patterns.factory.pizza.ingredients.dough.Dough;
import patterns.factory.pizza.ingredients.dough.Thin;
import patterns.factory.pizza.ingredients.proteins.Proteins;
import patterns.factory.pizza.ingredients.proteins.Seafood;

/**
 * Created by User on 30.05.2016.
 */
public class NyPizzaComponentsFactory implements PizzaComponentsFactory {
    @Override
    public Cheese createCheese() {
        return new Mozarella();
    }

    @Override
    public Dough createDough() {
        return new Thin();
    }

    @Override
    public Proteins createProteins() {
        return new Seafood();
    }
}
