package collections;

/**
 * Created by User on 22.03.2016.
 */
public class CustomLinkedList {

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
            return null;
        } else {
            if (next == null){
                return null;
            }
            return next.get(index);
        }

    }
}
