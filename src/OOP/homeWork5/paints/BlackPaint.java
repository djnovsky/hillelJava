package OOP.homeWork5.paints;

/**
 * Created by novsky on 12.03.2016.
 */
public class BlackPaint extends Paints {

    public BlackPaint(String color) {
        super(color);
    }

    @Override
    public int consumption() {
        int consuption = 1*2;
        return consuption;
    }
}
