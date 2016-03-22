package collections;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 22.03.2016.
 */
public class CustomLinkedListTest {

    @Test
    public void newInstanceShouldBeCreatedEmpty(){
        CustomLinkedList list = new CustomLinkedList();
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void sizeShouldChangeOnAdd(){
        CustomLinkedList list = new CustomLinkedList();
        list.add(new Object());
        list.add(new Object());
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void getShouldReturnApproriateElement(){
        CustomLinkedList list = new CustomLinkedList();
        Object element = new Object();
        list.add(element);

        Assert.assertEquals(element, list.get(0));



    }
}
