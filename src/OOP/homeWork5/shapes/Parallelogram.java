package OOP.homeWork5.shapes;

import OOP.homeWork5.paints.Paint;

/**
 * Created by novsky on 14.03.2016.
 */
public class Parallelogram extends Figure {

    private int side1;
    private int side2;
    private int height;
    private Paint paint;


    public Parallelogram(int side1,int side2, Paint paint){
        this.side1 = side1;
        this.side2 = side2;
        this.paint = paint;
    }

    @Override
    public double area() {
        return side1*height;
    }

    @Override
    public double perimeter() {
        return (side1*2)+(side2*2);
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString(){
        return super.toString() + "parallelogram with sides "
                + getSide1()+", "
                + getSide2()+ " and height "
                + getHeight()
                + ", and I'am "
                + paint.getColor()+ ". My area is " + area()
                + " and my perimeter is " + perimeter()
                + ". To paint me you'll need " + Math.round(paint.consumption()*area())
                + " litres of paint.";
    }
}
