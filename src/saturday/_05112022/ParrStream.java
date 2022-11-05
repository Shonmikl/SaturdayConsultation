package saturday._05112022;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ParrStream {
    static Random random = new Random();
    static List<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 100_000_000; i++) {
            list.add(random.nextInt(22));
        }

        long timeStream = System.currentTimeMillis();
        double sumStream = list.stream().reduce(Integer::sum).get();
        System.out.println(System.currentTimeMillis() - timeStream);

        long timeParStream = System.currentTimeMillis();
        double sumParStream = list.parallelStream().reduce(Integer::sum).get();
        System.out.println(System.currentTimeMillis() - timeParStream);
    }
}
