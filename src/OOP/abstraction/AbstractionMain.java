package OOP.abstraction;

/**
 * Created by User on 11.03.2016.
 */
public class AbstractionMain {

    public static void main(String[] args) {
        //new Auto(1995);

        Auto auto = new Lada(1995);
        System.out.println(auto);

        repair((Repairable) auto);


        Repairable repairable = new Lada(1999);
        System.out.println();
    }

    public static void repair(Repairable toRepair) {
        toRepair.repair();
    }
}
