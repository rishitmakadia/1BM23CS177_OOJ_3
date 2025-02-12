package Practice.Thread;

class ControlledThread implements Runnable {
    private final String name;
    private final Thread t;
    private boolean suspendFlag;

    ControlledThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                synchronized (this) {
                    while (suspendFlag) {
                        wait(); // Wait until the thread is resumed
                    }
                }
                System.out.println(name + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }

    // Suspend the thread
    synchronized void suspendThread() {
        suspendFlag = true;
    }

    // Resume the thread
    synchronized void resumeThread() {
        suspendFlag = false;
        notify(); // Notify the waiting thread to continue
    }

    public Thread getThread() {
        return t;
    }
}

public class ThreadSuspendResumeExample {
    public static void main(String[] args) {
        ControlledThread t1 = new ControlledThread("Thread One");
        ControlledThread t2 = new ControlledThread("Thread Two");

        try {
            Thread.sleep(1000);

            t1.suspendThread();
            System.out.println("Suspending Thread One");
            Thread.sleep(1000);

            t1.resumeThread();
            System.out.println("Resuming Thread One");
            Thread.sleep(1000);

            t2.suspendThread();
            System.out.println("Suspending Thread Two");
            Thread.sleep(1000);

            t2.resumeThread();
            System.out.println("Resuming Thread Two");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Wait for threads to finish
        try {
            t1.getThread().join();
            t2.getThread().join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}

