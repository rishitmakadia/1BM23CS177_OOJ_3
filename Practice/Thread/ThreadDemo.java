package Practice.Thread;

// Create a second thread.
class NewThread2 implements Runnable {
    Thread t;
    NewThread2() {
        // Create a new, second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start(); // Start the thread
    }
    // This is the entry point for the second thread.
    /*public void meth1()
    {
        t = new Thread(this, "Demo Thread");
        //t=new Thread();
        System.out.println("Child thread: " + t);
        t.start();
    }*/
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
class ThreadDemo {
    public static void main(String args[]) {
        NewThread2 t2=new NewThread2();               // create a new thread
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
//                t2.t.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        try {
            t2.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread exiting.");
    }
}