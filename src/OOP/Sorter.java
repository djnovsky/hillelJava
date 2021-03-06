package OOP;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by User on 11.03.2016.
 */
public class Sorter {

    public void sort(String[] unsorted) {
        boolean swap = false;
        do {
            swap = false;
            for (int i = 0; i < unsorted.length - 1; i++) {
                if (unsorted[i].compareTo(unsorted[i + 1]) > 0) {
                    String temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    swap = true;
                }
            }
        } while (swap);

    }

    public static void main(String[] args) {
        int[] a = {9,7,4,7,1,9};
        String[] s= {"z","q","a","k","n","h"};
        new Sorter().sort(s);
        Cat[] cats = new Cat[2];
        Cat cat1 = new Cat("askdas", "black", 10);
        Cat cat2 = new Cat("ssfsd", "red", 4);
        cat1.compareTo(cat2);
        //new Sorter().sort(cats);
        System.out.println(Arrays.toString(s));
    }

    public void sort(Object[] unsorted, Comparator comparator) {
        boolean swap = false;
        do {
            swap = false;
            for (int i = 0; i < unsorted.length - 1; i++) {
                if (comparator.compare(unsorted[i], unsorted[i+1]) > 0) {
                    Object temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    swap = true;
                }
            }
        } while (swap);

    }

    Comparator comparator = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    };

}

