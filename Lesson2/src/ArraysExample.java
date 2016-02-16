/**
 * Created by User on 16.02.2016.
 */
public class ArraysExample {
    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 3;
        array[1] = 5;
        array[2] = 9;
        array[3] = 1;
        array[4] = 8;
        //System.out.println(array[3]);

        int i =0;
        while (i<=4){
            System.out.println(array[i++]);
            //i++;
        }
    }
}
