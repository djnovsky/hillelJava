package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class RectangleExample {
    public static void main(String[] args) {


        Rectangle firstRectangle = new Rectangle(3, 2);
        firstRectangle.setHeight(2);
        firstRectangle.setWidth(3);
        //firstRectangle.area = 6;

        firstRectangle.setColor("blue");

        int w = firstRectangle.getWidth();
        int a = firstRectangle.calculateArea();

        //System.out.println(firstRectangle.height);
        //System.out.println(firstRectangle.color);

        //System.out.println(a);

        Rectangle secondRectangle = new Rectangle(10, 5);
//        secondRectangle.height = 5;
//        secondRectangle.width = 10;


        //System.out.println(secondRectangle.calculateArea());
        System.out.println("rectangle's color is: " + secondRectangle.getColor());//.charAt(0));//NullPointerException

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

        firstRectangle.setWidth(4);

        //System.out.println(thirdRectangle.color);

        //   anotherMethod();

        System.out.println("the first rectangle is " + firstRectangle);
        System.out.println(firstRectangle);

        Rectangle anotherRectangle = new Rectangle(firstRectangle.getWidth(), firstRectangle.getWidth());
        //anotherRectangle.width = firstRectangle.width;
        //anotherRectangle.height = firstRectangle.height;

        System.out.println("Another Rectangle is: " + anotherRectangle.toString());

        System.out.println(firstRectangle.equals(anotherRectangle));

        System.out.println("Rectangle Has: " + Rectangle.SIDES_OF_RECTANGLE);

    }

        //public static void anotherMethod() {

        //int i  = 10;
        //System.out.println("ldfslf");
        //anotherAnotherMethod();
        //    }

        //public static void anotherAnotherMethod() {
        //Rectangle rectangle = null;
        //rectangle.calculateArea();
        //    }

    public static int calculateArea(int height, int width) {
        return height * width;

    }

    public static int calculateArea(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWidth();

    }


}
