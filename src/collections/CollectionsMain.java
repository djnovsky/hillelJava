package collections;

import OOP.Cat;

import java.util.*;

/**
 * Created by User on 18.03.2016.
 */
public class CollectionsMain {
    public static void main(String[] args) {
        ArrayList<Cat> list = new ArrayList<>();
        list.add(new Cat("tom","grey",2015));
        list.add(new Cat("tom","grey",2015));
        list.add(new Cat("tom","grey",2015));
        //list.add("String");

        //System.out.println(list);

        //Cat tom = (Cat) list.get(3); - class cast exception
        Object tom = list.get(1);

        Cat tomCat = list.get(2);

        LinkedList<Cat> linkedCats = new LinkedList<>();
        linkedCats.add(new Cat("tom","grey",2015));
        linkedCats.add(new Cat("tom","grey",2015));
        linkedCats.add(new Cat("tom","grey",2015));

        //System.out.println(linkedCats.get(1));
        //printList(list);
        //printList(linkedCats);

        Collection<Cat> cats = linkedCats;
        //printForEach(cats);

        TreeSet<Cat> sortedCats = new TreeSet<>(new CatComparator());
        sortedCats.add(new Cat("Tom","grey",2015));
        sortedCats.add(new Cat("Bonya","grey",2012));
        sortedCats.add(new Cat("Jerry","grey",2009));
        sortedCats.add(new Cat("Terry","grey",2009));

        System.out.println("Set: ");
        printForEach(sortedCats);


    }


    public static void printForEach(Collection<Cat> collection){
        for (Cat cat: collection){
            System.out.println(cat);
        }
    }
//    public static void printList(ArrayList<Cat> cats){
//        for (Cat cat: cats){
//            System.out.println(cat);
//        }
//    }

    public static void printList(List<Cat> cats){
        for(int i = 0; i<cats.size(); i++){
            System.out.println(cats.get(i));
        }
    }
}
