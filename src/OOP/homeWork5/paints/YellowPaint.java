package OOP.homeWork5.paints;

/**
 * Created by novsky on 12.03.2016.
 */
public class YellowPaint extends Paint {


    private String color = "yellow";

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
        double consuption = 1.3;
        return consuption;
    }
}
