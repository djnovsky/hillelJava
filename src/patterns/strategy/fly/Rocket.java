package patterns.strategy.fly;

/**
 * Created by User on 15.03.2016.
 */
public class Rocket implements FlyBeheviour {
    @Override
    public void fly() {
        System.out.println("Somebody gave me a Rocket");
        System.out.println("Now I'm flying on the Rocket!...");
    }
}
