package OOP.HomeWork4;

import java.util.Scanner;

/**
 * Created by novsky on 25.02.2016.
 */
public class Circle {

    private double radius;
    private static double pi = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }


    public void circleArea() {
        double circleArea = pi * (Math.pow(radius, 2));
        System.out.println("Circle area is: " + circleArea);
    }

    public void circleLength() {
        double circleLength = 2 * pi * radius;
        System.out.println("Circle length is: " + circleLength);
    }

    public void circleDiameter() {
        double circleDiameterAmount = radius * 2;
        System.out.println("Circle diameter is: " + circleDiameterAmount);
    }
}
