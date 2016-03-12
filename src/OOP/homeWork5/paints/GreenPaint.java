package OOP.homeWork5.paints;

/**
 * Created by novsky on 12.03.2016.
 */
public class GreenPaint extends Paint {


    public GreenPaint(String color) {
        super(color);
    }

    @Override
    public int consumption() {
        int consuption = 1*5;
        return consuption;
    }
}
