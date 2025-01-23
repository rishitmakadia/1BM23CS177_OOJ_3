package Practice.Thread;

class Thread1 extends Thread {

    // Constructor
    Thread1() {
        super("Demo Thread");
        System.out.println("Child Thread: " + this);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting Child Thread");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        // Create a new thread
        Thread1 t1 = new Thread1();

        // Start the thread explicitly
        t1.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread exiting");
    }
}

