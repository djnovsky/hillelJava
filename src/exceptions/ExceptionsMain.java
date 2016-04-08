package exceptions;

import java.util.Random;

/**
 * Created by User on 08.04.2016.
 */
public class ExceptionsMain {

    public static void main(String[] args) {
        try {
            dangerStuff();
        } catch (MyOwnOutOfIndexException | ArithmeticException e){
            System.out.println(e);
        } catch (RuntimeException e){
            System.out.println("some new exception\n" + e);
        }
        System.out.println("end of programm");


    }

    public static void dangerStuff(){
        if (new Random().nextDouble() > 0.5) {
            doWorkWithList();
        } else {
            devide(1,0);
        }
    }

    private static void doWorkWithList(){
        throw new MyOwnOutOfIndexException("doWorkWithListException");
    }
    private static void devide(int a, int b) {
        int i = a/b;
    }

    private static void uncheckedExample() {
        devide(2, 5);
        devide(4, 2);
        System.out.println("before try");

        try {
            System.out.println("before devide");
            devide(2, 0);
            System.out.println("after devide");
        } catch (ArithmeticException e){
            System.out.println("in catch");
            System.out.println(e);
        } finally {
            System.out.println("finally block");
        }
        System.out.println("after try");
    }

    public static void checkedExample() throws InterruptedException {
        try {
            Thread.sleep(1333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(1333);
    }


}
