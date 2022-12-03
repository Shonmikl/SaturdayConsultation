package saturday._03_12_2022.deadLock;

public class DeadLockEx {
    public static final Object LOCK_1 = new Object();
    public static final Object LOCK_2 = new Object();

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        System.out.println("T1: Try to lock object 1");
        synchronized (DeadLockEx.LOCK_1) {
            System.out.println("T1: Monitor LOCK_1 locked");
            System.out.println("T1: Try to lock object 2");
            synchronized (DeadLockEx.LOCK_2) {
                System.out.println("T1: Monitor LOCK_1 and LOCK_2 locked");
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("T2: Try to lock object 2");
        synchronized (DeadLockEx.LOCK_2) {
            System.out.println("T2: Monitor LOCK_2 locked");
            System.out.println("T2: Try to lock object 1");
            synchronized (DeadLockEx.LOCK_1) {
                System.out.println("T2: Monitor LOCK_1 and LOCK_2 locked");
            }
        }
    }
}