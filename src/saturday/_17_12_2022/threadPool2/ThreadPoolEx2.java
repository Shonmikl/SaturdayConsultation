package saturday._17_12_2022.threadPool2;

import java.util.concurrent.*;

public class ThreadPoolEx2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunImpl200());
//        }
//        scheduledExecutorService.schedule(new RunImpl200(), 3, TimeUnit.SECONDS);
//        scheduledExecutorService.shutdown();

//        scheduledExecutorService.scheduleAtFixedRate(new RunImpl200(), 3, 1, TimeUnit.SECONDS);
//        Thread.sleep(10000);
//        scheduledExecutorService.shutdown();

        scheduledExecutorService.scheduleWithFixedDelay(new RunImpl200(), 3, 5, TimeUnit.SECONDS);
        Thread.sleep(10000);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool();

    }
}

class RunImpl200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-> begins work");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + "-> work ends");
    }
}