package patterns.strategy;

import patterns.strategy.fly.FlyBeheviour;
import patterns.strategy.quack.QuackBehavior;

/**
 * Created by User on 15.03.2016.
 */
public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBeheviour flyBeheviour;

    public void fly() {
       flyBeheviour.fly();
    }

    public void swim() {
        System.out.println("I'm swimming!");
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void setFlyBeheviour(FlyBeheviour flyBeheviour) {
        this.flyBeheviour = flyBeheviour;
    }

    public abstract void display();
}
