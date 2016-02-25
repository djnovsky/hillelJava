package OOP;

/**
 * Created by User on 23.02.2016.
 */
public class OopMain {
    public static void main(String[] args) {

        passPrimitives();

        PassObjects();

        passImmutableObject();

        equalsExample();

        Human i = new Human();

        System.out.println("Hands: " +Human.handsAmount);
        Human.handsAmount = 1;
        System.out.println("Hands: " +Human.handsAmount);
        i.handsAmount = 2;
        System.out.println(Human.handsAmount);
        i.name = "Stas";
        System.out.println("My name is: " + i.name);
        Human you = new Human();
        you.name = "Masha";

        System.out.println("we are == "+(i==you));
        System.out.println("we are equals: "+i.equals(you));

        System.out.println("names are ==: "+(i.name == you.name));
        System.out.println("names are equals: "+i.name.equals(you.name));

        System.out.println(Human.sayHello());
        System.out.println(i.introduce());
        System.out.println(you.introduce());

        System.out.println();

    }

    private static void equalsExample() {
        Integer a = 333;
        Integer b = 333;

        System.out.println("== " +(a == b));
        boolean aEqualsB = a.equals(b);
        System.out.println("Equals "+aEqualsB);
    }

    private static void passImmutableObject() {
        Integer i  = 10;
        modifyInteger(i);
        System.out.println(i);
    }


    public static void print(int a){
        System.out.println(a);
        a=3;
    }
private static void modifyInteger(Integer i) {
    i = null;

    }
    public static void modifyArray(int[] array){
        array[0] = 10;
        array[1] = 20;
    }

    public static void PassObjects (){
        int[] ints = new int[3];
        Utils.printArray(ints);
        modifyArray(ints);
        Utils.printArray(ints);
    }

    public static void passPrimitives() {
        int a = 10;
        print(a);
    }
}
