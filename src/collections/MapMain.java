package collections;

import OOP.inheritance.hierarchy.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 29.03.2016.
 */
public class MapMain {
    public static void main(String[] args) {
        Map<Person, Integer> personToDiscount = new HashMap<>();

        personToDiscount.put(new Person("Vasya"), 10);
        personToDiscount.put(new Person("Petya"), 10);
        personToDiscount.put(new Person("Vova"), 10);

        personToDiscount.put(new Person("Vasya"), 20);

        Integer vasyaDiscount = personToDiscount.get(new Person("Vasya"));
        //System.out.println(vasyaDiscount);


        doStuff(personToDiscount);

        for (Map.Entry<Person, Integer> personIntegerEntry : personToDiscount.entrySet()){
            System.out.println(personIntegerEntry.getKey()+", my discount is " + personIntegerEntry.getValue() + " percent");
        }

//        for (Person person : personToDiscount.keySet()){
//            System.out.println(personToDiscount.get(person));;
//        }

    }

    private static void doStuff(Map<Person, Integer> someMap) {
        //someMap = new HashMap<>();
        someMap.put(new Person("Ashot"), 95);
    }
}
