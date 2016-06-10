package patterns.singleton;

/**
 * Created by Novsky on 08.06.2016.
 */
public class TheGodSingleton implements God{
    private TheGodSingleton() {
        System.out.println("God always been here!");
    }

    public static TheGodSingleton getInstance() {
        return Holder.instance;
    }

    public static void prophet() {
        System.out.println("Jesus");
    }

    @Override
    public final void create() {
        System.out.println("All the world in 7 days");
    }

    @Override
    public void heal() {
        System.out.println("Stand up and go!");
    }

    @Override
    public String getName() {
        return "God";
    }

    private static class Holder{
        static final TheGodSingleton instance = new TheGodSingleton();
    }

   /* public static void clear() {
        instance = null;
    }*/

}
