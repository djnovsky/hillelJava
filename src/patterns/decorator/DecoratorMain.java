package patterns.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Beverege arabica = new Arabica();
        Beverege robusta = new Robusta();

        arabica = new Milk(arabica);
        arabica = new Milk(arabica);

        robusta = new Milk(new Cream(robusta));

        printBeverege(arabica);
        printBeverege(robusta);

    }

    public static void printBeverege(Beverege beverege) {
        System.out.println("price is: " + beverege.cost() + "\n" + beverege.description());
    }
}
