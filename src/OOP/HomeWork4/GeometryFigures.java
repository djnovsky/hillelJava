package OOP.HomeWork4;

import java.util.Scanner;

/**
 * Created by novsky on 25.02.2016.
 */
public class GeometryFigures {
    public static void main(String[] args) {
        System.out.println("Please enter your Figure:");
        System.out.println("1 = Circle, 2 = Triangle, 3 = Rectangle");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch (choice){
            case "1":
                Circle.getDiameterLenghtAndArea();
                break;
            case "2":
                Triangle.triangleScanner();
                //System.out.println("Coming soon...");
                break;
            case "3":
                RectangleTask.EnteringAreaAndPerimeterOfRectangle();
                //System.out.println("Coming soon...");
                break;
            default:
                System.out.println("Please enter right number");
                break;

        }
        System.out.println("You was marvellous, see you next time :)");
    }
}
