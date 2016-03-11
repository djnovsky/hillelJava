package OOP.homeWork5.animals;

/**
 * Created by novsky on 11.03.2016.
 */
public class Cat extends Hommie {


    @Override
    public String voice(){
        return super.voice() + "My name is " + getName() + ", Meow...!";
    }
}
