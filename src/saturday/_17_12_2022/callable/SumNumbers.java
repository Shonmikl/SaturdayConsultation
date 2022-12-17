package saturday._17_12_2022.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumNumbers {
    private static final long VALUE = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futuresResult = new ArrayList<>();
        long valueDivide = VALUE / 10;

        for (int i = 0; i < 10; i++) {
            long from = valueDivide * i + 1;
            long to = valueDivide * (i + 1);
            Plus task = new Plus(from, to);
            Future<Long> future = executorService.submit(task);
            futuresResult.add(future);
        }

        for (Future<Long> result : futuresResult) {
            sum += result.get();
        }
        executorService.shutdown();
        System.out.println("Total sum is: " + sum);
    }
}

class Plus implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public Plus(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call()  {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Sum from: " + from + " to: " + to + " is " + localSum);
        return localSum;
    }
}