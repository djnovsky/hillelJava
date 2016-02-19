/**
 * Created by novsky on 19.02.2016.
 */
public class Exercise0 {

    //1. Создайте программу, выводящую на экран все четырёхзначные числа
    // последовательности 1000 1003 1006 1009 1012 1015 ….
    public static void main(String[] args) {


        int step = 3;
        for (int i = 1000; i < 9999; i+=step) {
            System.out.println(i);

        }
    }
}
