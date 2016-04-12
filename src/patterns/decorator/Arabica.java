package patterns.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class Arabica implements Beverege {
    @Override
    public int cost() {
        return 15;
    }

    @Override
    public String description() {
        return "Beautiful arabica";
    }
}
