package OOP.HomeWork4;

import java.util.Scanner;

/**
 * Created by novsky on 25.02.2016.
 */
public class RectangleTask {

    public static void main(String[] args) {

        EnteringAreaAndPerimeterOfRectangle();
    }

    public static void EnteringAreaAndPerimeterOfRectangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rectangle area: ");
        int area = in.nextInt();
        System.out.println("Enter rectangle perimeter: ");
        int perimeter = in.nextInt();

        SidesOfRectangle(area, perimeter);
    }

    public static void SidesOfRectangle(int area, int perimeter) {
        double side1, side2;
        double halfPerimeter = perimeter / 2;
        double discriminant = (Math.pow(halfPerimeter, 2)) - (4 * 1 * area);
        if (discriminant > 0) {
            side1 = (halfPerimeter - Math.sqrt(discriminant)) / 2;
            side2 = halfPerimeter - side1;
            System.out.println("Sides of rectangle are: " + side1 + " and " + side2);
        } else if (discriminant == 0) {
            side1 = (halfPerimeter + Math.sqrt(discriminant)) / (2);
            System.out.println("This rectangle is a square with side: " + side1);
        } else if (discriminant < 0) {
            System.out.println("Are you joking, this is not a Rectangle!");
        }
    }
}


