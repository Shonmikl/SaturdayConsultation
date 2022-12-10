package saturday._05_11_2022;

import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {
        int[] ints = {98, 74, 56, 3, 2, 11, 26, 5, 48, 45, 1};
        int arr = Arrays.stream(ints)

                .filter(el-> el %2 ==0)
                .reduce((acc, el)-> acc * el)

                        .getAsInt();

        System.out.println(arr);
    }
}
