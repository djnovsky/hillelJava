package OOP.homeWork5.shapes;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by novsky on 14.03.2016.
 */
public abstract class Figure {

    String color;

    public abstract double area();
    public abstract double perimeter();



    public String colorMyShape(){
        String[] colors = {"yellow", "green", "blue", "black", "red","grey"};
        String color = colors[new Random().nextInt(colors.length)];
        return color;
    }

    public double consumption(String color, double area) {
        if (color.equals("yellow")) {
            return area * 2.1;
        }
        if (color.equals("black")) {
            return area * 1.6;
        }
        if (color.equals("blue")) {
            return area * 1.4;
        }
        if (color.equals("red")) {
            return area * 1.1;
        }
        if (color.equals("green")) {
            return area * 0.9;
        }
        if (color.equals("grey")) {
            return area * 0.2;

        }
        return 0;
    }

    public String toString(){
        return "Hello, I am geometric figure ";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
