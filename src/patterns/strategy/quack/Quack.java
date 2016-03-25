package patterns.strategy.quack;

/**
 * Created by User on 15.03.2016.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
