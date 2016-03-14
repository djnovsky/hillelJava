package OOP.homeWork5.shapes;

import OOP.homeWork5.paints.Paint;

/**
 * Created by novsky on 14.03.2016.
 */
public class FigureMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.setColor(rectangle.colorMyShape());
        System.out.println(rectangle.toString());
        Circle circle = new Circle(10);
        circle.setColor(circle.colorMyShape());
        System.out.println(circle.toString());
        Triangle triangle = new Triangle(20,30,20);
        triangle.setHeight(10);
        triangle.setColor(triangle.colorMyShape());
        System.out.println(triangle.toString());
        Square square = new Square(10);
        square.setColor(square.colorMyShape());
        System.out.println(square.toString());
        Parallelogram parallelogram = new Parallelogram(10,20);
        parallelogram.setHeight(15);
        parallelogram.setColor(parallelogram.colorMyShape());
        System.out.println(parallelogram.toString());

    }
}
