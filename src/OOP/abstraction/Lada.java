package OOP.abstraction;

/**
 * Created by User on 11.03.2016.
 */
public class Lada extends Auto implements Repairable{

    public Lada(int year){
        super(year);
    }


    @Override
    public String getMark() {
        return "LADA";
    }

    @Override
    public void repair() {
        System.out.println("repaired");
    }
}
