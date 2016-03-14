package OOP.homeWork5.shapes;

/**
 * Created by novsky on 14.03.2016.
 */
public class Rectangle extends Figure {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return (height + width) * 2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() + "rectangle with width "
                + getWidth() + " and height "
                + getHeight()
                + ", and I'am "
                + getColor() + ". My area is " + area()
                + " and my perimeter is " + perimeter()
                + ". To paint me you'll need " + consumption(getColor(), area())
                + " litres of paint.";
    }
}
