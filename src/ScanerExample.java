import java.util.Scanner;

/**
 * Created by User on 16.02.2016.
 */
public class ScanerExample {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scaner = new Scanner(System.in);
        System.out.print("Input first number: ");
        a = scaner.nextInt();
        System.out.print("Input second number: ");
        b = scaner.nextInt();

        System.out.println();

        int sum = a + b;

        System.out.println("The sum is: " + sum);
    }
}
