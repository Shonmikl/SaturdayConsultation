package saturday._19112022.multithread;

public class Ex4 {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("!!!!");
//            }
//        }).start();

        new Thread(()-> System.out.println("*****")).start();
    }
}
