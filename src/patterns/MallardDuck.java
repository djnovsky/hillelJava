package patterns;

import patterns.fly.Fly;
import patterns.quack.Quack;
import patterns.quack.QuackBehavior;

/**
 * Created by User on 15.03.2016.
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBeheviour = new Fly();
    }

    @Override
    public void display() {
        System.out.println("mallard duck");
    }
}
