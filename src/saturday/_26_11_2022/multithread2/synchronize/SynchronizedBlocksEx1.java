package saturday._26_11_2022.multithread2.synchronize;

public class SynchronizedBlocksEx1 {
    public static void main(String[] args) {
        MyRunnableImpl2 runnableImpl2 = new MyRunnableImpl2();
        Thread thread1 = new Thread(runnableImpl2);
        Thread thread2 = new Thread(runnableImpl2);
        Thread thread3 = new Thread(runnableImpl2);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2 {
    volatile static int count = 0;
}

class MyRunnableImpl2 implements Runnable {
    public synchronized void do2() {
        System.out.println("*************");
    }
    public void do1() {
        //t1 t2 t3
        do2();//t2
        synchronized (this) {//t2
            Counter2.count++;
            System.out.println(Counter2.count);
        }//t1
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
           do1();
        }
    }
}