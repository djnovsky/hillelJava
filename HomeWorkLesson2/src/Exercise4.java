/**
 * Created by novsky on 19.02.2016.
 */
public class Exercise4 {
    //5. Найти сумму первых n элементов массива
    public static void main(String[] args) {


    int[] array = {1, 25, 38, 55, 89, 93};


    int sum = 0;
    for (int i = 0; i < 6; i++) {
        sum = array[i] + sum;
    }
    System.out.println(sum);

    }
}
