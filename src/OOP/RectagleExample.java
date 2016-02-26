package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class RectagleExample {
    public static void main(String[] args) {


        Rectangle firstRectangle = new Rectangle();
        firstRectangle.height = 2;
        firstRectangle.width = 3;
        //firstRectangle.area = 6;

        firstRectangle.color = "blue";

        int w = firstRectangle.width;
        int a = firstRectangle.calculateArea();

        //System.out.println(firstRectangle.height);
        //System.out.println(firstRectangle.color);

        //System.out.println(a);

        Rectangle secondRectangle = new Rectangle();
        secondRectangle.height = 5;
        secondRectangle.width = 10;


        //System.out.println(secondRectangle.calculateArea());
        System.out.println("rectangle's color is: " + secondRectangle.color);//.charAt(0));//NullPointerException

        int firstRectangleWidth = 3;
        int firstRectangleHeight = 4;
        int secondRectangleWidth = 5;
        int secondRectangleHeight = 10;

        int area = calculateArea(firstRectangleHeight, secondRectangleWidth);
        //разрозненые переменные
        area = calculateArea(firstRectangle);
        int secondArea;
        secondArea = calculateArea(secondRectangle);
        //System.out.println(area);
        //System.out.println(secondArea);

        Rectangle thirdRectangle = null;

        //thirdRectangle.calculateArea();//NullPointerException

        firstRectangle.width = 4;



    }

    public static int calculateArea(int height, int width) {
        return height * width;

    }

    public static int calculateArea(Rectangle rectangle) {
        return rectangle.height * rectangle.width;

    }
}
