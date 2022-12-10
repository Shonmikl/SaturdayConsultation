package saturday._12_11_2022;

import java.util.Arrays;

public class DomZadanie3 {
    static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    static int getMax(int[] max) {
        //отсортировать массив и вернуть последний элемент
       return 0;
    }

    static int[] invertArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == 0) {
                array[index] = 1;
            } else if (array[index] == 1) {
                array[index] = 0;
            }
        }
        return array;
    }

    private static double getMaxValue(double v, double v1, int i) {
        return Math.max(Math.max(v, v1), i);
    }


    public static void main(String[] args) {
        // home1
        int[] array = {10, 11, 88, 2, 12, 120};
        double variable = getMaxValue(5.3, 39.6, -4);
        int[] result = new int[array.length];
        int max = getMax(array);
    }
}