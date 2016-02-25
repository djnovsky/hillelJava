package OOP.HomeWork4;

import java.util.Scanner;

/**
 * Created by novsky on 25.02.2016.
 */
public class Circle {

    static double radius;
    static double pi = 3.14;

    public static void main(String[] args) {

        getDiameterLenghtAndArea();

    }

    public static void getDiameterLenghtAndArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle radius: ");
        double radius = scanner.nextInt();

        circleDiameter(radius);

        circleLenght(radius);

        circleArea(radius);
    }

    private static void circleArea(double radius) {
        double circleArea = pi*(Math.pow(radius,2));
        System.out.println("Circle area is: " + circleArea);
    }

    private static void circleLenght(double radius) {
        double circleLenght = 2*pi*radius;
        System.out.println("Circle lenght is: " + circleLenght);
    }

    private static void circleDiameter(double radius) {
        double circleDiametrAmount = radius*2;
        System.out.println("Circle diameter is: " + circleDiametrAmount);
    }
}
