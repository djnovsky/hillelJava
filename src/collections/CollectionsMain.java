package collections;

import OOP.Cat;

import java.util.*;

/**
 * Created by User on 18.03.2016.
 */
public class CollectionsMain {
    public static void main(String[] args) {
      HashSet<Cat> set = new HashSet<>();
        Cat cat1 = new Cat("tom","gray",2015);
        set.add(cat1);
        Cat cat2 = new Cat("tom","gray",2015);

        System.out.println("equals: " + cat1.equals(cat2) );
        System.out.println("hash 1: " + cat1.hashCode());
        System.out.println("hash 2: " + cat2.hashCode());

        System.out.println("cat1 in set: " + set.contains(cat1));
        System.out.println("cat1 in set: " + set.contains(cat2));

        set.add(new Cat("tim","gray",2013));
        set.add(new Cat("trohim","white",2011));
        set.add(new Cat("murzik","black",2000));
        set.add(new Cat("barsik","gray-red",2012));

        //cat1.setName("Barsik");

//        System.out.println("Hash for Barsik: " + cat1.hashCode());
//
//        System.out.println("Barsik in set: cat1 " + set.contains(cat1));

        for (Cat cat: set){
            System.out.println(cat);
        }

        ArrayList<Cat> list = new ArrayList<>();
        list.add(cat1);
        //System.out.println("cat 2 in list: " + list.contains(cat2));
    }

    private static void list() {
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
    public static void printList(ArrayList<Cat> cats){
        for (Cat cat: cats){
            System.out.println(cat);
        }
    }
    public static void printList(List<Cat> cats){
        for(int i = 0; i<cats.size(); i++){
            System.out.println(cats.get(i));
        }
    }
}
