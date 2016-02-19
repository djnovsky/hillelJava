import java.util.Arrays;
import java.util.Collections;

/**
 * Created by novsky on 19.02.2016.
 */
public class Exercise5 {
    //6. Найти минимальный и максимальный элемент массива

    public static void main(String[] args) {
        Integer[] numbers = { 8, 2, 6, 7, 0, 1, 4, 9, 5, 3, 24,-2, 16, 43 };

        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));

        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}
