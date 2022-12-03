package saturday._03_12_2022.lockInterface;

import lombok.AllArgsConstructor;

import java.util.concurrent.locks.*;


public class ATM {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Person("Konstantin", lock);
        new Person("Natalia", lock);
        new Person("Alexandr", lock);
        new Person("Dmitry", lock);
        new Person("Olga", lock);
        new Person("Said", lock);
    }
}

class Person extends Thread {
    String name;
    private Lock lock;

    public Person(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
            try {
//                System.out.println(name + " waiting for....");
//                lock.lock();
                System.out.println(name + " on the ATM");
                Thread.sleep(120);
                System.out.println(name + " finished");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name + " ran away");
        }
    }
}