package OOP.homeWork5.shapes;

import OOP.homeWork5.paints.Paint;

/**
 * Created by novsky on 14.03.2016.
 */
public class Square extends Figure {
    private int side;
    private Paint paint;

    public Square(int side, Paint paint){
        this.paint = paint;
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
                + paint.getColor()+ ". My area is " + area()
                + " and my perimeter is " + perimeter()
                + ". To paint me you'll need " + (paint.consumption()*area())
                + " litres of paint.";
    }
}
