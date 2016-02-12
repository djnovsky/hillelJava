/**
 * Created by User on 12.02.2016.
 */
public class LowCircuit {

    public static void main(String[] args) {
        if (firstFunct() || secondFunct()) {
            System.out.println("In Main");
        }

        if (!firstFunct() == false){
            System.out.println("! makes false true");
        }
    }

    public static boolean firstFunct() {
        System.out.println("In first function");
        return true;
    }


    public static boolean secondFunct() {
        System.out.println("In second function");
        return true;
    }
    }

