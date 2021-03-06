package patterns.strategy;

import patterns.strategy.fly.FlyNoWay;
import patterns.strategy.quack.Quack;

/**
 * Created by User on 15.03.2016.
 */
public class Decoy extends Duck{

    public Decoy() {
        quackBehavior = new Quack();
        flyBeheviour = new FlyNoWay();
    }

    @Override
    public void swim() {
        System.out.println("I can't swim");
    }

    @Override
    public void display() {
        System.out.println("decoy");
    }
}
