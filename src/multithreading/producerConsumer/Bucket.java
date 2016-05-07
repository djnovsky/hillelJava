package multithreading.producerConsumer;

/**
 * Created by User on 06.05.2016.
 */
public class Bucket {
    private int counter;
    private long changesCounter;


    public void get() {
        synchronized (this) {
            while (counter <= 0) {
                try {
                    wait();
                } catch (InterruptedException ignored) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            counter--;
            changesCounter++;
            notifyAll();
            check();
        }
    }


    public synchronized void put() {
        while (counter >= 1000) {
            try {
                wait();
            } catch (InterruptedException ignored) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        counter++;
        changesCounter++;
        notifyAll();
        check();
    }


    public synchronized void check() {
        if (counter < 0 || counter > 1000) {
            System.out.println("error: counter = " + counter);
        }
    }



    @Override
    public String toString() {
        return "Bucket{" +
                "counter=" + counter +
                ", changesCounter=" + changesCounter +
                '}';
    }
}
