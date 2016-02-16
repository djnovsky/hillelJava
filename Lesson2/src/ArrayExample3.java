/**
 * Created by User on 16.02.2016.
 */
public class ArrayExample3 {
    public static void main(String[] args) {
        int[] array = {3, 5, 9, 1, 8};
        System.out.println("Break cycle");
        for ( int i = 0; i < 5; i++){
            System.out.println(array[i]);
            if (array[i] == 9) {
                break;
            }
        }
        System.out.println("Continue cycle");
    for (int i = 0;i < 5; i++){
        if (array[i] == 9) {
            continue;
        }
        System.out.println(array[i]);
    }



    }
}
