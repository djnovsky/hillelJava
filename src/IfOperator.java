/**
 * Created by User on 12.02.2016.
 */
public class IfOperator {

    public static void main(String[] args) {

        int v1 = 5, v2 = 5;

        int min =  v1 < v2 ? v1 : v2;
        System.out.println("Minimum is: " + min);
        //оператор (cond) ? true : false (if)
        min = v1 < v2 ? v1 : (v1>v2) ? v2 : -1;

        System.out.println("Minimum is: " + min);
    }
}
