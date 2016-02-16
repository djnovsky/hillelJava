/**
 * Created by User on 16.02.2016.
 */
public class ArraysExample4 {
    public static void main(String[] args) {
        int[] array = {3, 5, 9, 1, 8};

        //for (int element : array) {

                //    System.out.println(element);
       //}
        int min = array[0];
        for (int element:array){
            //min = Math.min (element, min);
            if (element<min){
                min=element;

            }
        }
        System.out.println(min);
    }
}
