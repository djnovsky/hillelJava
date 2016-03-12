package OOP.homeWork5.paints;

/**
 * Created by novsky on 12.03.2016.
 */
public class YellowPaint extends Paint {


    public YellowPaint(String color) {
        super(color);
    }

    @Override
    public int consumption() {
        int consuption = 1*3;
        return consuption;
    }
}
