/**
 * Created by User on 09.02.2016.
 */
public class MyFirstClass {
    public static void main (String args[]){
        String message = "Hello World! I'm ";
        int birthYear = 1987;
        int age = 2016 - birthYear;

       // System.out.println(age);
        System.out.println(message + age + ".");
        long years = 2016;
        //long millisecondsFromBC = (long) 2016 * 365 * 24 * 3600 * 1000;

        long millisecondsFromBC = 2016L*365L*24L*3600L*1000L;

        int intYears = (int) years;

        System.out.println(millisecondsFromBC);
    }
}
