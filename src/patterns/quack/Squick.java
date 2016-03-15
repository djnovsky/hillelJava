package patterns.quack;

/**
 * Created by User on 15.03.2016.
 */
public class Squick implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squick!");
    }
}
