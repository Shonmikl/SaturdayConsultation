package saturday._19112022.multithread;

public class Ex8 extends Thread {

}

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}