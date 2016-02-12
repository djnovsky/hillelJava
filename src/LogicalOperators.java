/**
 * Created by User on 12.02.2016.
 */
public class LogicalOperators {

    public static void main(String[] args) {
        int v1 = 3, v2 = 5;
        if (v1 == 3 | v2 == 5) {
            System.out.println("Correct numbers");
        } else {
            System.out.println("One number or more incorrect");
        }


        if (v1 == 3 & v2 == 5) {
            System.out.println("Correct numbers");
        } else {
            System.out.println("One number or more incorrect");
        }


    if(v1!=3) {
        System.out.println("incorrect numbers");
    }
}
}