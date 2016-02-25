package OOP.HomeWork4;

import java.util.Scanner;

/**
 * Created by novsky on 25.02.2016.
 */
public class Triangle {

    static int numberOfSides = 3;

    static int perimeter;

    static int area;

    public static void main(String[] args) {

        triangleScanner();

    }

    public static void triangleScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter triangle high:");
        int triangleHigh = scanner.nextInt();
        System.out.println("Please enter triangle base side:");
        int triangleBase = scanner.nextInt();

        areaOfTriangle(triangleHigh,triangleBase);
    }


    public static void areaOfTriangle(int triangleHigh, int triangleBase) {
        double triangleArea = (triangleHigh*triangleBase)/2;
        System.out.println("Triangle area is: " + triangleArea);


    }

}
