package OOP;

import collections.CatComparator;
import collections.ReversedComparator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by User on 18.03.2016.
 */
public class SorterTest {
    @Test
    public void yearShouldBeInAscendingOrder() {
        Sorter sorter = new Sorter();


        Cat tom = new Cat("Tom", "white", 2013);
        Cat murzik = new Cat("Murzik", "black", 2015);
        Cat barsik = new Cat("Barsik", "grey", 2014);

        Cat[] cats = {tom, murzik, barsik};

        tom = new Cat("Tom", "white", 2013);


        sorter.sort(cats, new CatComparator());

        Cat[] expected = {tom, barsik, murzik};

       assertArrayEquals(expected, cats);


    }

    @Test
    public void yearShouldBeInDecendingOrder() {
        Sorter sorter = new Sorter();


        Cat tom = new Cat("Tom", "white", 2013);
        Cat murzik = new Cat("Murzik", "black", 2015);
        Cat barsik = new Cat("Barsik", "grey", 2014);

        Cat[] cats = {tom, murzik, barsik};

        tom = new Cat("Tom", "white", 2013);


        sorter.sort(cats, new ReversedComparator(new CatComparator()));

        Cat[] expected = {murzik, barsik, tom};


        assertArrayEquals("Cats are in wrong order", expected, cats);
    }
}

