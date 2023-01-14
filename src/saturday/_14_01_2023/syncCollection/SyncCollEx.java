package saturday._14_01_2023.syncCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncCollEx {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }

        //ArrayList<Integer> target = new ArrayList<>();
        List<Integer> synchList = Collections.synchronizedList(new ArrayList<>());

        Runnable runnable = () -> synchList.addAll(source);

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(synchList);
    }
}