package Practice.AWT;

// Using suspend() and resume().
class NewThread implements Runnable {
    String name; // name of thread
    Thread t;
    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start(); // Start the thread
    }
    // This is the entry point for thread.
    public void run() {
        try {
            for(int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
            }
        }  catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }
}
class SuspendResume {
    public static void main(String args[]) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        try {
//Thread.sleep(1000);
            ob1.t.suspend();
            System.out.println("Suspending thread One");
            Thread.sleep(1000);
            ob1.t.resume();
            System.out.println("Resuming thread One");
            Thread.sleep(1000);
            ob2.t.suspend();
            System.out.println("Suspending thread Two");

            Thread.sleep(1000);
            ob2.t.resume();
            System.out.println("Resuming thread Two");
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
// wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}



/*

C:\j2ee\bin>javac SuspendResume.java
Note: SuspendResume.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

C:\j2ee\bin>java SuspendResume

New thread: Thread[One,5,main]
New thread: Thread[Two,5,main]
One: 15
Two: 15
Two: 14
One: 14
Two: 13
One: 13
Two: 12
One: 12
Two: 11
One: 11
Two: 10
Suspending thread One
Two: 9
Two: 8
Two: 7
Two: 6
Two: 5
Resuming thread One
Suspending thread Two
One: 10
One: 9
One: 8
One: 7
One: 6
One: 5
Two: 4
Resuming thread Two
Waiting for threads to finish.
One: 4
Two: 3
One: 3
Two: 2
Two: 1
One: 2
One: 1
Two exiting.
One exiting.
Main thread exiting.

*/
