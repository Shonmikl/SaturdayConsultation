package saturday.funcInter;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        m1(Main::m2);

//        int[] arr = {1, 2, 6, 5, 4, 7, 8, 9};
//        Arrays.stream(arr)
//                .map(el -> el * 10)
//                .forEach(System.out::println);
    }

    public static void m2() {
        System.out.println("!!!!");
        System.out.println("))))");
        System.out.println("^^^^");
    }

    public static void m1(I i) {
        System.out.println("@@@@");
        i.get();
    }
}

@FunctionalInterface
interface I {
    void get();
}