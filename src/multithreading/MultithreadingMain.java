package multithreading;

/**
 * Created by User on 29.04.2016.
 */
public class MultithreadingMain {
    public static void main(String[] args) {
        Thread anotherThread = new Thread(new NumberPrinter());
        anotherThread.start();

        System.out.println("Waiting on second thread");

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        anotherThread.interrupt();

        try {
            anotherThread.join(); //waits for thread, until it ends
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finish");

    }
}
