package OOP.homeWork5.animals;

/**
 * Created by novsky on 11.03.2016.
 */
public class Dog extends Hommie {

    public Dog(){

    }

    public Dog(String name){
        this.name = name;

    }
    @Override
    public String voice(){
        return super.voice() + "My name is " + getName() + ", Woof...!";
    }

}
