package saturday._19112022.multithread;

public class Ex5 {
    public static void main(String[] args) {
//        MyThread5 myThread5 = new MyThread5();
//        System.out.println("Name  of myThread5 is: " + myThread5.getName());
//        System.out.println("Priority  of myThread5 is: " + myThread5.getPriority());
//
//        MyThread5 myThread6 = new MyThread5();
//        System.out.println("Name  of myThread6 is: " + myThread6.getName());
//        System.out.println("Priority  of myThread6 is: " + myThread6.getPriority());
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("myThread5");
        myThread5.setPriority(Thread.NORM_PRIORITY);

        System.out.println("Name  of myThread5 is: " + myThread5.getName());
        System.out.println("Priority  of myThread5 is: " + myThread5.getPriority());
    }
}

class MyThread5 extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
