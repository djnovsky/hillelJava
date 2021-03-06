package collections;

import exceptions.MyOwnOutOfIndexException;
import patterns.iterator.CustomLinkedListIterator;

import java.util.Iterator;

/**
 * Created by User on 22.03.2016.
 */
public class CustomLinkedList implements Iterable {

    private ListElement next;

    public int size() {
        if (next == null) {
            return 0;
        } else {
            return next.size();
        }
    }

    public void add(Object o) {
        if (next == null) {
            next = new ListElement(o);
        } else {
            next.add(0);
        }

    }

    public Object get(int index) {
        if (next == null) {
            //return null;
            throw new MyOwnOutOfIndexException("size= " + size() + " index= " + index);
        } else {
            try {
                return next.get(index);
            } catch (MyOwnOutOfIndexException e) {
                throw new MyOwnOutOfIndexException("size= " + size() + " index= " + index);
            }

        }

    }


    public Iterator iterator() {
        return new CustomLinkedListIterator(next);
    }
}
