package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class Rectangle {

    static int sides = 4;

    int width;
    int height;
    //int area; -не хранить не нужные поля

    String color;

    public int calculateArea(){
        return width * height;
    }

    public void changeSidesCount(){
        sides = sides+1;

        //нельзя менять статик (количество сторон принадлежит вем прямоугольниам)
    }

}
