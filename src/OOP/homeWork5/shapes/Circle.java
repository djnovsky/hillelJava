package OOP.homeWork5.shapes;

import OOP.homeWork5.paints.Paint;
import OOP.homeWork5.paints.YellowPaint;

/**
 * Created by novsky on 14.03.2016.
 */
public class Circle extends Figure{
    private int radius;
    final double pi = Math.PI;
    private Paint paint;

    public Circle(int radius, Paint paint){
        this.paint = paint;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.round(pi * (Math.pow(radius, 2)));
    }

    @Override
    public double perimeter() {
        return Math.round(2 * pi * radius);
    }

    public double diameter() {
        return radius * 2;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return super.toString() + "circle with radius "
                + getRadius()
                + " , and I'am "
                + paint.getColor() + ". My area is " + area()
                + " and my circumference is " + perimeter()
                + ". To paint me you'll need " + Math.round(paint.consumption()*area())
                + " litres of paint.";
    }

}
