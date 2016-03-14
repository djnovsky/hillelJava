package OOP.homeWork5.paints;

/**
 * Created by novsky on 12.03.2016.
 */
public class GreenPaint extends Paint {


    String color = "green";

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
        double consuption = 0.8;
        return consuption;
    }
}
