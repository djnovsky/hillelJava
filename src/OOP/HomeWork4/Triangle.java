package OOP.HomeWork4;

/**
 * Created by novsky on 25.02.2016.
 */
public class Triangle {

    private final int NUMBER_OF_SIDES = 3;

    private int side1;
    private int side2;
    private int side3;


    Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }


    public void areaOfTriangle(int triangleHigh) {
        double triangleArea = (triangleHigh * getSide3()) / 2;
        System.out.println("Triangle area is: " + triangleArea);


    }

    public int getNUMBER_OF_SIDES() {
        return NUMBER_OF_SIDES;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public String toString(){
        String result = "Triangle with sides "+side1+", "+side2+", "+side3+".";
                return result;
    }
}
