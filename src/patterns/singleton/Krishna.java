package patterns.singleton;

/**
 * Created by Novsky on 08.06.2016.
 */
public class Krishna implements God {
    @Override
    public void create() {
        System.out.println("Created universe instantly");
    }

    @Override
    public void heal() {
        System.out.println("Think you are healthy");
    }

    @Override
    public String getName() {
        return "Krishna";
    }
}
