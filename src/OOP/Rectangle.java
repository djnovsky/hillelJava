package OOP;

/**
 * Created by User on 26.02.2016.
 */
public class Rectangle {

    static final int SIDES_OF_RECTANGLE = 4;
    //для статических геттеров не делают
    private int width;
    private int height;
    //int area; -не хранить не нужные поля

    private String color;

    //временные данные - переменные
    //поля класса - флс, налл, 0
    //переменные не могут быть не присвоенны
    //их надо инициализировать, перед тем кка что-то делать

    Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }

    public int calculateArea(){
        return width * height;
    }

    public void setHeight(int height){
        this.height = height;
    //    area = height * width;
    }
    public void setWidth(int width){
        this.width = width;
   //     area = height * width;
    }

    public String toString(){
        String result = "Rectangle (a = ";
        result += width;
        result += ", b = ";
        result += height+")";
        return result;
    }


    public boolean equals(Rectangle other){
        return height == other.height && width == other.width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

        //нельзя менять статик (количество сторон принадлежит вем прямоугольниам)
    }


