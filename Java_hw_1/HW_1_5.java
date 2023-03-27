package Java_homework.Java_hw_1;
// должен вернуть массив длины len, каждое значение которого равно initialValue

import java.util.Arrays;
import java.util.Scanner;

public class HW_1_5 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("input length");
        int len = iScanner.nextInt();
        System.out.println("input value");
        int initialValue = iScanner.nextInt();
        iScanner.close();
        System.out.println(Arrays.toString(createArray(len, initialValue)));
    }

    private static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;

        }

        return arr;
    }

}
