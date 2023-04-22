package saturday._2023_04_23;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {

    private static long fibStream(final int fibNumber) {
        var result =
                Stream.iterate(new long[]{0, 1}, arr -> new long[]{arr[1], arr[0] + arr[1]})
                        .limit(fibNumber)
                        .map(y -> y[0])
                        .max(Long::compareTo);

        return result.orElseThrow(IllegalArgumentException::new);
    }

    private static long fibRecur(final int fibNumber) {
        if(fibNumber < 0) {
            throw new IllegalArgumentException();
        }

        if(fibNumber == 0) {
            return 0;
        }
        return fibNumber == 1 || fibNumber == 2 ? 1L : fibRecur(fibNumber - 2) + fibRecur(fibNumber - 1);
    }


    public static void main(String[] args) {
        System.out.println(fibStream(10));
        int n = 10;// 0, 1, 2, 3, 4, 5, 6, 7
        //  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377,

        List<Integer> list = IntStream
                .rangeClosed(0, n - 1)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Число Фибоначчи F(" + n + ")=" +
                IntStream.rangeClosed(0, n - 1)//индексы
                        .peek(x -> {
                            if (x > 1) {
                                list.set(x, list.get(x - 1) + list.get(x - 2));
                            }
                        })
                        .map(list::get)
                        .boxed()
                        .toList()
                        .get(n - 1)
        );
    }
}