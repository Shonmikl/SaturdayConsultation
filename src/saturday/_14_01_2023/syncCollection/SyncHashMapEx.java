package saturday._14_01_2023.syncCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class SyncHashMapEx {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Svitlana");
        map.put(2, "Dmitry");
        map.put(3, "Olga");
        map.put(4, "Alexandr");
        map.put(5, "Natalia");
        map.put(6, "Denys");
        map.put(7, "Mikhail");

        System.out.println(map);

        Runnable runnable1 = ()-> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.println(i + " : " + map.get(i));
            }
        };

        Runnable runnable2 = ()-> {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.remove(7);
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(map);
    }
}
