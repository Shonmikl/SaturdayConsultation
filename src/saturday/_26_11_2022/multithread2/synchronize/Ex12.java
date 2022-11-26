package saturday._26_11_2022.multithread2.synchronize;

import lombok.ToString;

@ToString
public class Ex12 {
    static final Object LOCK = new Object();
    void MCall() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println(this);
            System.out.println("M Call");
            Thread.sleep(3000);
            System.out.println("M Call ended");
        }
    }

    void SCall() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println(this);
            System.out.println("S Call");
            Thread.sleep(4000);
            System.out.println("S Call ended");
        }
    }

    void WCall() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println(this);
            System.out.println("W Call");
            Thread.sleep(5000);
            System.out.println("W Call ended");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MCallInt());
        Thread thread2 = new Thread(new WCallInt());
        Thread thread3 = new Thread(new SCallInt());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MCallInt implements Runnable {

    @Override
    public void run() {
        try {
            new Ex12().MCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class WCallInt implements Runnable {
    @Override
    public void run() {
        try {
            new Ex12().WCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class SCallInt implements Runnable {
    @Override
    public void run() {
        try {
            new Ex12().SCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}