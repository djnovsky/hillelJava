package OOP.homeWork5.animals;

/**
 * Created by novsky on 11.03.2016.
 */
public class Giraffe extends Wild {

    private boolean isPredator = false;

    @Override
    public String voice(){
        if (isPredator == true) {
            return super.voice() + " and I am angry ";
        } else {
            return super.voice();
        }
    }
}
