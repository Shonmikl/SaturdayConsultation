package saturday._19112022.multithread;

public class Ex3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
//        Thread myThread3 = new Thread(new MyThread3());
//        Thread myThread4 = new Thread(new MyThread4());
//        myThread3.start();
//        myThread4.start();
        Thread thread = new Thread(new Ex3());
        thread.start();

        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
    }


}

//class MyThread3 implements Runnable {
//    public void run() {
//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//class MyThread4 implements Runnable {
//    public void run() {
//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//        }
//    }
//}