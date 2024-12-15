class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        threadName = name;
    }

    // Overriding the run method
    public void run() {
        System.out.println(threadName + " started.");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " - Count: " + i);
                Thread.sleep(500); // Pause for 500ms
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " finished.");
    }
}

public class CIE_24 {
    public static void main(String[] args) {
        // Main Thread
        System.out.println("Main Thread started.");

        // Creating Multiple Threads
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");
        MyThread thread3 = new MyThread("Thread-3");

        // Starting Threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Checking if threads are alive
        System.out.println("Thread-1 is alive: " + thread1.isAlive());
        System.out.println("Thread-2 is alive: " + thread2.isAlive());
        System.out.println("Thread-3 is alive: " + thread3.isAlive());

        try {
            // Waiting for threads to finish using join()
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted.");
        }

        System.out.println("Thread-1 is alive after join: " + thread1.isAlive());
        System.out.println("Thread-2 is alive after join: " + thread2.isAlive());
        System.out.println("Thread-3 is alive after join: " + thread3.isAlive());

        // Main thread finishes after all threads are done
        System.out.println("Main Thread finished.");
    }
}
