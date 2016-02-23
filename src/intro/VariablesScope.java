package intro;

/**
 * Created by User on 12.02.2016.
 */
public class VariablesScope{

    static int classVariabe = 10;

    public static void main(String[] args) {
        int num = 5;

        if (num > 0){
            int v1 = 3;
            System.out.println("More than 0");
            System.out.println(v1);
        }
        //scope of num variable is main method
        System.out.println(num);
        //scope of the v1 variable is "if" block
        //System.out.println(v1);
    }

    public static void someFunction (){
        int someVar = 0;

    }

}
