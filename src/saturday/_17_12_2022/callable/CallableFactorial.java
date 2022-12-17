package saturday._17_12_2022.callable;

import lombok.AllArgsConstructor;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial1 factorial1 = new Factorial1(9);
        Future<Integer> future = executorService.submit(factorial1);
        try {
            System.out.println(future.isDone());
            System.out.println("Waiting for a result.......");
            factorialResult = future.get();
            System.out.println("The result has already got!");
            System.out.println(future.isDone());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

@AllArgsConstructor
class Factorial1 implements Callable<Integer> {
    int f;

    @Override
    public Integer call() throws Exception {
        if(f < 0) {
            throw new Exception("Please put the correct number");
        }
        int result = 1;
        for (int i = 1; i <= f ; i++) {
            result *=i;
            Thread.sleep(1000);
        }
        return result;
    }
}