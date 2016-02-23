package intro;

/**
 * Created by User on 16.02.2016.
 */
public class MinMaxHomeWork {
    public static void main(String[] args) {

        //1. Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа
        int a = 6;
        int b = 12;
        int c = 7;


        int minNumberHW = Math.min(a, Math.min(b, c));
        System.out.println("Min number of three is: " + minNumberHW);

        int minNumber = Math.min(a,b);
        System.out.println(minNumber);
        int absNumber = Math.abs(c);
        System.out.println("Abs value: " + absNumber);
        int maxNumber = Math.max(a, b);
        System.out.println(maxNumber);
    }

}
