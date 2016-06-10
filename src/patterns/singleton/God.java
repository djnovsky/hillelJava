package patterns.singleton;

/**
 * Created by Novsky on 08.06.2016.
 */
public interface God {
    void create();

    void heal();

    String getName();

    default void resurect() {
        System.out.println("Resurected");
    }
}
