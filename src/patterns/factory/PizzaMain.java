package patterns.factory;

import enums.PizzaType;
import patterns.factory.factory.*;

/**
 * Created by User on 30.05.2016.
 */
public class PizzaMain {
    public static void main(String[] args) {
        PizzaComponentsFactory nyComponentFactory = new NyPizzaComponentsFactory();        }
        PizzaStore nyPizzaStore = new PizzaStore(new NyPizzaFactory(NyPizzaComponentsFactory));
        nyPizzaStore.order(PizzaType.CHEESE);
    PizzaComponentsFactory chComponentFactory = new ChPizzaComponentsFactory();
        PizzaStore chPizzaStore = new PizzaStore(new ChPizzaFactory());
        chPizzaStore.order(PizzaType.CHEESE);


    }
}
