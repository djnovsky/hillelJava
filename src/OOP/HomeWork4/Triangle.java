package OOP.HomeWork4;

import java.util.Scanner;

/**
 * Created by novsky on 25.02.2016.
 */
public class Triangle {

    private static int numberOfSides = 3;

    private int triangleHigh;
    private int triangleBase;

    Triangle(int triangleHigh, int triangleBase){
        this.triangleHigh = triangleHigh;
        this.triangleBase = triangleBase;
    }


    public void areaOfTriangle() {
        double triangleArea = (triangleHigh*triangleBase)/2;
        System.out.println("Triangle area is: " + triangleArea);


    }

    public int getNumberOfSides(){
        return numberOfSides;
    }

}
