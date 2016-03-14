package OOP.homeWork5.shapes;

/**
 * Created by novsky on 14.03.2016.
 */
public class Triangle extends Figure {

    private int side1;
    private int side2;
    private int side3;
    private int height;


    public Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        return (height * side1) / 2;
    }

    @Override
    public double perimeter() {
        return side1+side2+side3;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString(){
        return super.toString() + "triangle with sides "
                + getSide1()+", "
                + getSide2()+", "
                + getSide3() + " and height "
                + getHeight()
                + ", and I'am "
                + getColor()+ ". My area is " + area()
                + " and my perimeter is " + perimeter()
                + ". To paint me you'll need " + consumption(getColor(),area())
                + " litres of paint.";
    }
}
