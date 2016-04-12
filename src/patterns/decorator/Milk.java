package patterns.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class Milk extends BeveregeDecorator {

    public Milk(Beverege beverege) {
        super(beverege);
    }

    @Override
    public int cost() {
        return 10 + super.cost();
    }

    @Override
    public String description() {
        return super.description() + ", milk";
    }
}
