package intro;

/**
 * Created by User on 12.02.2016.
 */
public class BlockedIf {
    public static void main(String[] args) {
        int v1 = 3, v2=5, diff;

        if (v1 < v2) {
            System.out.println("v2 is bigger");
            diff = v2 - v1;
            System.out.println("Difference: " + diff);
        } else {
            System.out.println("v1 is bigger");
            diff = v1 - v2;
            System.out.println("Difference: " + diff);
        }
    }
}
