package saturday._22102022.inputOutput._29102022;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx {
    public static void main(String[] args) {
        final int a = 10;

        int[] arr = new int[10];

        //todo immutable?
        final int[] arr1 = {98, 9, 65, 41, 236, 5, 47, 89};

        System.out.println();
        for (int qq = 0; qq < arr1.length; qq++) {
            arr1[qq] = new Random().nextInt(111);
        }
        System.out.println(Arrays.toString(arr1));
    }
}