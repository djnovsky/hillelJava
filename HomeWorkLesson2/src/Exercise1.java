/**
 * Created by novsky on 19.02.2016.
 */
public class Exercise1 {
    //2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
    public static void main(String[] args) {


        int count = 0;
        for (int i = 1; i > 0; i += 2) {
            if (count < 55) {
                System.out.println(i);
                count++;
            } else {
                break;
            }
        }
    }
}
