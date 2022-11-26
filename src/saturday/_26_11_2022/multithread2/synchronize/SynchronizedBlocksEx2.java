package saturday._26_11_2022.multithread2.synchronize;

import saturday._26_11_2022.multithread2.datarace.Ex11;

public class SynchronizedBlocksEx2 {
    volatile static int counter = 0;
    public static synchronized void increment() {
        synchronized (SynchronizedBlocksEx2.class) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class R2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Ex11.increment();
        }
    }
}