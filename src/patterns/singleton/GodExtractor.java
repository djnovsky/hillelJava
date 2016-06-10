package patterns.singleton;

/**
 * Created by Novsky on 08.06.2016.
 */
public class GodExtractor implements Runnable{
    TheGodSingleton god;
    @Override
    public void run() {
        god = TheGodSingleton.getInstance();
    }
}
