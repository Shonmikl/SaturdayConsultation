package saturday._03_12_2022.waitNotify;

import lombok.AllArgsConstructor;

public class WaitNotifyEx {
    public static void main(String[] args) {
        Market market = new Market();

        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
//        Thread thread4 = new Thread(consumer4);
//        Thread thread5 = new Thread(consumer5);

        thread1.start();
        thread2.start();
    }
}

class Market {
    private int breadCount;
    private final Object lock = new Object();

    public void getBread() {
        synchronized (lock) {
            while (breadCount < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            breadCount--;
            System.out.println("Bought one bread");
            System.out.println("Bread numbers is: " + breadCount);
            lock.notify();
        }
    }

    public synchronized void putBread() {
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("One bread added");
        System.out.println("Bread numbers is: " + breadCount);
        this.notify();
    }
}

@AllArgsConstructor
class Producer implements Runnable {
    Market market;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

@AllArgsConstructor
class Consumer implements Runnable {
    Market market;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}