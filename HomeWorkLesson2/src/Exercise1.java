/**
 * Created by novsky on 19.02.2016.
 */
public class Exercise1 {
    //2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
    public static void main(String[] args) {


        int step = 2;
        for (int i = 1; i < 110; i+=step) {
            System.out.println(i);

        }
    }
}
