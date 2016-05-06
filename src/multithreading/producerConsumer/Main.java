package multithreading.producerConsumer;

/**
 * Created by User on 06.05.2016.
 */
public class Main {

    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        Thread consumerThread = new Thread(new Consumer(bucket));
        Thread producerThread = new Thread(new Producer(bucket));

        consumerThread.start();
        producerThread.start();

        try {
            consumerThread.join();
            producerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        interuptAll(consumerThread, producerThread);

        System.out.println("All threads are stopped");
        System.out.println(bucket.toString());
    }

    private static void interuptAll(Thread consumerThread, Thread producerThread) {
        consumerThread.interrupt();
        producerThread.interrupt();
    }
}
