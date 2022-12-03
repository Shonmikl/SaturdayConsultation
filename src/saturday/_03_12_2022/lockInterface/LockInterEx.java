package saturday._03_12_2022.lockInterface;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockInterEx {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(call::mobileCall);
        Thread thread2 = new Thread(call::skypeCall);
        Thread thread3 = new Thread(call::whatsAppCall);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call {
    private final Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(1000);
            System.out.println("Mobile call end");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
 //           lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(1500);
            System.out.println("Skype call end");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }

    void whatsAppCall() {
        lock.lock();
        try {
            System.out.println("Whats App call starts");
            Thread.sleep(1800);
            System.out.println("Whats App call end");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }

}
