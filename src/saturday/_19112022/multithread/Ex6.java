package saturday._19112022.multithread;

public class Ex6 implements Runnable {
    @Override
    public void run() {
        System.out.println("Method run. Thread name is: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex6());
        thread.start();
        System.out.println("Method main. Thread name: " + Thread.currentThread().getName());
    }
}