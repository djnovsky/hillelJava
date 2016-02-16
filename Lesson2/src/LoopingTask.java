/**
 * Created by User on 16.02.2016.
 */
public class LoopingTask {
    public static void main(String[] args) {
        int factorial = 1;
        int i = 5;

        while (i >0) {
            factorial= factorial*i;
            i--;


        }
        System.out.println("Result is: " + factorial);
    }
}
