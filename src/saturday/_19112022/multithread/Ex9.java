package saturday._19112022.multithread;

public class Ex9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main has begun");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join(1500);
        System.out.println(thread.getState());
        System.out.println("Method main has finished");
    }
}

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Worker has begun");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Worker has finished");
    }
}