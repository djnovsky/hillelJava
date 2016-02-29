package OOP.HomeWork4;

/**
 * Created by novsky on 29.02.2016.
 */
public class GetSidesOfRectangleFromAreaAndPerimeter {
    static int perimeter;
    static int areaOfARectangle;


    public static void sidesOfRectangle(int perimeter, int areaOfARectangle) {
        double height, width;
        double halfPerimeter = perimeter / 2;
        double discriminant = (Math.pow(halfPerimeter, 2)) - (4 * 1 * areaOfARectangle);
        if (discriminant > 0) {
            height = (halfPerimeter - Math.sqrt(discriminant)) / 2;
            width = halfPerimeter - height;
            System.out.println("Sides of rectangle are: " + height + " and " + width);
        } else if (discriminant == 0) {
            height = (halfPerimeter + Math.sqrt(discriminant)) / (2);
            System.out.println("This rectangle is a square with side: " + height);
        } else if (discriminant < 0) {
            System.out.println("Are you joking, this is not a Rectangle!");
        }
    }
}
