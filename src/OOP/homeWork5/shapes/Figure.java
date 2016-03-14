package OOP.homeWork5.shapes;

/**
 * Created by novsky on 14.03.2016.
 */
public abstract class Figure {

    public abstract double area();
    public abstract double perimeter();

    public String toString(){
        return "Hello, I am geometric figure ";
    }
}
