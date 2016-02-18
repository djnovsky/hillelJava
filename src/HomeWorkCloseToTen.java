/**
 * Created by novsky on 18.02.2016.
 */
public class HomeWorkCloseToTen {

    //4. Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11

    public static void main(String[] args) {
        int ten = 10;
        int firstClose = 8;
        int secondClose = 11;

       /*int distance = Math.abs(firstClose-ten);
        System.out.println(distance);

        int distance1 = Math.abs(secondClose-ten);
        System.out.println(distance1);*/

        if ((Math.abs(firstClose-ten))<(Math.abs(secondClose-ten))){
            System.out.println("First number is closer to 10");
        } else {
            System.out.println("Second number is closer to 10");
        }
    }
}
