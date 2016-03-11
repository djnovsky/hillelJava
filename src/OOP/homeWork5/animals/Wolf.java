package OOP.homeWork5.animals;

/**
 * Created by novsky on 11.03.2016.
 */
public class Wolf extends Wild {

    private boolean isPredator = true;

    @Override
    public String voice(){
        if (isPredator == true) {
            return super.voice() + " and I am angry ";
        } else {
            return super.voice();
        }
    }
}
