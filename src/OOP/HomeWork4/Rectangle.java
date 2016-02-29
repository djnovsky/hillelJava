package OOP.HomeWork4;

/**
 * Created by novsky on 25.02.2016.
 */
public class Rectangle {

    private static int numberOfSides = 4;

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
        return numberOfSides;
    }




}
