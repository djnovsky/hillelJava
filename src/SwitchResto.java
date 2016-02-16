/**
 * Created by User on 16.02.2016.
 */
public class SwitchResto {
    public static void main(String[] args) {
        int amount = 100;
        double sum = 0;

        String rating = "good";
        switch (rating){
            case "terrible":
                sum = amount;
                break;
            case "good":
                sum = amount+(amount*0.05);
                break;
            case "nice":
                sum = amount+(amount*0.1);
                break;
            case "great":
                sum = amount+(amount*0.2);
                break;
            default:
                System.out.println("blah blah");
        }
        System.out.println("Total is: " + sum);
    }
}
