package OOP.HomeWork4;

/**
 * Created by novsky on 25.02.2016.
 */
public class GeometryFigures {
    public static void main(String[] args) {

        Circle circleExample = new Circle(12);
        circleExample.circleArea();
        circleExample.circleDiameter();
        circleExample.circleLength();

        Triangle triangleExample = new Triangle(12,16,21);
        System.out.println("Triangle have " + triangleExample.getNUMBER_OF_SIDES() + " sides.");
        System.out.println("It is "+triangleExample.toString());
        triangleExample.areaOfTriangle(10);

        Rectangle rectangleExample = new Rectangle(12, 20);
        System.out.println("Area of rectangle is: " + rectangleExample.calculateArea());
        System.out.println("Perimeter of rectangle is: " + rectangleExample.calculatePerimeter());
        System.out.println("Rectangle have " + rectangleExample.getNumberOfSides() + " sides.");
        System.out.println(rectangleExample.toString());
        GetSidesOfRectangleFromAreaAndPerimeter.sidesOfRectangle(rectangleExample.calculatePerimeter(), rectangleExample.calculateArea());


    }
}
