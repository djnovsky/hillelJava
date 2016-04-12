package patterns.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class HouseBlend implements Beverege {
    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String description() {
        return "Blend Coffee ";
    }
}
