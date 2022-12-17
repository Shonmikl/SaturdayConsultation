package saturday._17_12_2022.callable;

import lombok.AllArgsConstructor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Factorial {
    static int factorialResult;
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialImpl factorial = new FactorialImpl(5);
        executorService.execute(factorial);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(factorialResult);
    }
}

@AllArgsConstructor
class FactorialImpl implements Runnable {
    int f;

    @Override
    public void run() {
        if(f < 0) {
            System.out.println("Please put the correct number");
            return;
        }
        int result = 1;
        for (int i = 1; i <= f ; i++) {
            result *=i;
        }
        Factorial.factorialResult = result;
    }
}