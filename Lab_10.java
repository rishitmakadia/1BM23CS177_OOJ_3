import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SafeResource1 {
    private final Lock lock = new ReentrantLock(); // Lock for the resource

    public boolean tryLockBoth(SafeResource1 otherResource) {
        while (true) {
            boolean gotFirstLock = lock.tryLock();  // Try to acquire this resource's lock
            boolean gotSecondLock = otherResource.tryLock();  // Try to acquire the other resource's lock

            if (gotFirstLock && gotSecondLock) {
                System.out.println(Thread.currentThread().getName() + " acquired both locks");
                return true;
            }

            if (gotFirstLock) lock.unlock();  // Release if only first lock acquired
            if (gotSecondLock) otherResource.unlock();  // Release if only second lock acquired
        }
    }

    public boolean tryLock() {
        return lock.tryLock();
    }

    public void unlock() {
        lock.unlock();
    }
}

class DeadlockResolved {
    public void demonstrate() {
        SafeResource1 res1 = new SafeResource1();
        SafeResource1 res2 = new SafeResource1();

        Thread t1 = new Thread(() -> {
            if (res1.tryLockBoth(res2)) {
                System.out.println("Thread-1 completed safely");
                res1.unlock();
                res2.unlock();
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            if (res2.tryLockBoth(res1)) {
                System.out.println("Thread-2 completed safely");
                res2.unlock();
                res1.unlock();
            }
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}

class Resource1 {
    synchronized void lock(Resource2 res2) {
        System.out.println(Thread.currentThread().getName() + " locked Resource1");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(Thread.currentThread().getName() + " trying to lock Resource2...");
        res2.method2();
    }

    synchronized void method1() {
        System.out.println(Thread.currentThread().getName() + " is working with Resource1");
    }
}

class Resource2 {
    synchronized void lock(Resource1 res1) {
        System.out.println(Thread.currentThread().getName() + " locked Resource2");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(Thread.currentThread().getName() + " trying to lock Resource1...");
        res1.method1();
    }

    synchronized void method2() {
        System.out.println(Thread.currentThread().getName() + " is working with Resource2");
    }
}

class DeadlockDemo {
    public void demonstrate() {
        Resource1 res1 = new Resource1();
        Resource2 res2 = new Resource2();
        Thread t1 = new Thread(() -> res1.lock(res2), "Thread-1");
        Thread t2 = new Thread(() -> res2.lock(res1), "Thread-2");

        t1.start();
        t2.start();
    }
}

class Lab_10 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Deadlock and Resolution:");

        System.out.println("\nDeadlock Scenario:");
        new DeadlockDemo().demonstrate();

        System.out.println("\nResolved Deadlock:");
        new DeadlockResolved().demonstrate();
    }
}