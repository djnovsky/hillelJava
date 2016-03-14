package OOP.homeWork5.shapes;

/**
 * Created by novsky on 14.03.2016.
 */
public class Square extends Figure {
    private int side;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Square(int side){
        this.side = side;
    }

    @Override
    public double area() {

        return side*side;
    }

    @Override
    public double perimeter() {

        return side*4;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString(){
        return super.toString() + "square with side " + getSide()
                + ", and I'am "
                + getColor()+ ". My area is " + area()
                + " and my perimeter is " + perimeter()
                + ". To paint me you'll need " + consumption(getColor(),area())
                + " litres of paint.";
    }
}
