package collections;

import OOP.Cat;
import OOP.Sorter;

import java.util.Arrays;

/**
 * Created by User on 18.03.2016.
 */
public class SorterMain {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();

        Cat[] cats = new Cat[3];

        cats[0] = new Cat("Tom", "white", 2013);
        cats[1] = new Cat("Murzik", "black", 2015);
        cats[2] = new Cat("Barsik", "grey", 2014);


        System.out.println("before" + Arrays.toString(cats));

        sorter.sort(cats, new CatComparator());

        System.out.println("after "  + Arrays.toString(cats));

        sorter.sort(cats, new ReversedComparator(new CatComparator()));

        System.out.println("after after: "+ Arrays.toString(cats));
    }
}
