package saturday._05_11_2022;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayPrint implements Serializable {
    public static void main(String[] args) {
        int[] pr = {3,2,1};
        String[] st = {"S", "R", "T"};

        System.out.println(Arrays.toString(st));

        Person person = new Person();
        List<Integer> integerList = new LinkedList<>();
        integerList.add(1000);
        integerList.add(1001);
        integerList.add(1002);
        integerList.add(1003);

        integerList.add(1, 222);

    }
}
