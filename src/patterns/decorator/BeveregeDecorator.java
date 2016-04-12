package patterns.decorator;

/**
 * Created by User on 12.04.2016.
 */
public abstract class BeveregeDecorator implements Beverege {

    private Beverege beverege;

    public BeveregeDecorator(Beverege beverege){
        this.beverege = beverege;
    }

    public int cost(){
        return beverege.cost();
    }

    public String description(){
        return beverege.description();
    }

}
