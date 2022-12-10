package saturday._10_12_2022.interrupted;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");

        InterThread interThread = new InterThread();
        interThread.start();

        interThread.interrupt();

        interThread.join();
        System.out.println("Main ends");
    }
}


class InterThread extends Thread {
    double sum = 0;
    public void run() {
        for (int i = 1; i < 1_000_000; i++) {
            if(isInterrupted()) {
                System.out.println("!!!!!!!!!");
                return;
            }
            sum += i;
            System.out.println(sum);
        }
    }
}