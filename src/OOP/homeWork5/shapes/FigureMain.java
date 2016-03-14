package OOP.homeWork5.shapes;

import OOP.homeWork5.paints.*;

/**
 * Created by novsky on 14.03.2016.
 */
public class FigureMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20, new YellowPaint());
        System.out.println(rectangle.toString());
        Circle circle = new Circle(10,new GreenPaint());
        System.out.println(circle.toString());
        Triangle triangle = new Triangle(20,30,20,new BlackPaint());
        triangle.setHeight(10);
        System.out.println(triangle.toString());
        Square square = new Square(10,new  RedPaint());
        System.out.println(square.toString());
        Parallelogram parallelogram = new Parallelogram(10,20,new BlackPaint());
        parallelogram.setHeight(15);
        System.out.println(parallelogram.toString());

    }
}
