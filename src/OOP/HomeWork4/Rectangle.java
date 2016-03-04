package OOP.HomeWork4;

/**
 * Created by novsky on 25.02.2016.
 */
public class Rectangle {

    static final int NUMBER_OF_SIDES = 4;

    private int width;
    private int height;

    Rectangle(int height, int width) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea(){
        return width * height;
    }

    public  int calculatePerimeter(){return (width+height)*2;}

    public int getNumberOfSides() {
        return NUMBER_OF_SIDES;
    }

    public String toString(){
        String result = "Rectangle (a = ";
        result += width;
        result += ", b = ";
        result += height+")";
        return result;
    }




}
