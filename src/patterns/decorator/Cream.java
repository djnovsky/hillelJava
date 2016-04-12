package patterns.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class Cream extends BeveregeDecorator {

    public Cream(Beverege beverege) {
        super(beverege);
    }

    @Override
    public int cost() {
        return 4 + super.cost();
    }

    @Override
    public String description() {
        return super.description() + ", cream";
    }
}
