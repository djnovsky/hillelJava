/**
 * Created by novsky on 19.02.2016.
 */
public class Exercise3 {
    //4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
    public static void main(String[] args) {
        for (int i=2; i <=1048576; i*=2){
            System.out.println(i);
        }
    }
}