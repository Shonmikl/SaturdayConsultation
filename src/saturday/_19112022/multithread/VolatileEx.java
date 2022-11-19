package saturday._19112022.multithread;

public class VolatileEx extends Thread {
    volatile boolean b = true;

    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop has finished. And counter is: "  + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread = new VolatileEx();
        thread.start();
        Thread.sleep(2000);
        System.out.println("After two second later.....");
        thread.b = false;
        thread.join();
        System.out.println("END");
    }
}
