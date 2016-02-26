package OOP;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by User on 26.02.2016.
 */
public class VetClinc {

    public static void main(String[] args) {
        Cat catTom = new Cat("Tom","Blue",2015);
        catTom.vaccinate("SACC");

        //catTom.birthYear = 2014;

        System.out.println(catTom.getBirthYear());
        System.out.println(catTom.getName());

        catTom.setName("Murzik");

        System.out.println(catTom.getName());


        String name = catTom.getName();
        String newName = name.replace('T','K');
        System.out.println(newName);




        //Cat Murzik = new Cat("Murzik", "Gray", 2014);


        //catTom.init();


        //catTom.color = "Blue";
        //catTom.name = "Tom";
        //catTom.birthYear = 2015;
        //catTom.vaccines = new String[10];

        //vaccinate(catTom);


        //System.out.println(Arrays.toString(catTom.vaccines));

    }

//    public static void vaccinate (Cat cat){
//        //cat.vaccines[cat.vaccineCount++] = "SACC"; //так нельзя делать
//        cat.vaccines[cat.vaccineCount] = "SACC";
//        cat.vaccineCount++;
//    }
}
