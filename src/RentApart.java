/**
 * Created by User on 12.02.2016.
 */
public class RentApart {
    public static void main(String[] args) {
        int rentDays = 12;

        int dayPrice = 40;
        int sevenDayDisc = -50;
        int threeDaysDisc = -20;

        int discountMounth = (rentDays>3 && rentDays<7) ? threeDaysDisc : (rentDays>=7) ? sevenDayDisc : 0;
        int rentPrice = (rentDays*dayPrice)+discountMounth;

        System.out.println("Your rent is: " + rentPrice + "$");




    }
}
