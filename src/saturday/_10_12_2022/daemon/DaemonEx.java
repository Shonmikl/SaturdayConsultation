package saturday._10_12_2022.daemon;

import saturday._22102022.inputOutput.FileWriterEx;

import java.io.FileWriter;
import java.io.IOException;

public class DaemonEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start");

        UserThread userThread = new UserThread();
        userThread.setName("User Thread");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("Daemon Thread");
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

        System.out.println("Main thread ends");
    }
}

class UserThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " is Daemon " + isDaemon());
        for (char i = 'A'; i <= 'Z'; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " is Daemon " + isDaemon());
        try (FileWriter writer = new FileWriter("E:\\SaturdayConsultation\\dt888.txt")) {
            for (int i = 0; i < 1_000; i++) {
                System.out.println(i);
                Thread.sleep(10);
                writer.write("A");
            }

            System.out.println("DONE!");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}