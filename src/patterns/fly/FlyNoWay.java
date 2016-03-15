package patterns.fly;

/**
 * Created by User on 15.03.2016.
 */
public class FlyNoWay implements FlyBeheviour {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
