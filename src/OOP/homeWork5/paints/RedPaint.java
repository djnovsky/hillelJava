package OOP.homeWork5.paints;

/**
 * Created by novsky on 12.03.2016.
 */
public class RedPaint extends Paint {

    private String color = "red";

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double consumption() {
        double consuption = 1.1;
        return consuption;
    }
}
