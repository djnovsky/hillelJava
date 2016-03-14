package OOP.homeWork5.shapes;

/**
 * Created by novsky on 14.03.2016.
 */
public class Circle extends Figure{
    private int radius;
    final double pi = Math.PI;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        double areaRound = Math.round(pi * (Math.pow(radius, 2)));
        return areaRound;
    }

    @Override
    public double perimeter() {
        double perimeterRound = Math.round(2 * pi * radius);
        return perimeterRound;
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
                + getColor()+ ". My area is " + area()
                + " and my circumference is " + perimeter()
                + ". To paint me you'll need " + consumption(getColor(),area())
                + " litres of paint.";
    }
}
