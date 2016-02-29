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

        Triangle triangleExample = new Triangle(16, 21);
        triangleExample.areaOfTriangle();
        System.out.println("Triangle have " + triangleExample.getNumberOfSides() + " sides.");

        Rectangle rectangleExample = new Rectangle(64, 240);
        rectangleExample.sidesOfRectangle();
        System.out.println("Rectangle have " + rectangleExample.getNumberOfSides() + " sides.");

    }
}
