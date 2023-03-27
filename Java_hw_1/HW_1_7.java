package Java_homework.Java_hw_1;
//2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

import java.util.Arrays;

public class HW_1_7 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(mult(arr)));
    }
    public static int[] mult(int[] initialArr) {
        int[] resultArr = new int[initialArr.length];
        for (int i = 0; i < initialArr.length; i++) {
            if (initialArr[i] < 6)
                resultArr[i] = initialArr[i] * 2;
            else if (initialArr[i] >= 6)
                resultArr[i] = initialArr[i];
        }
        return resultArr;
    }

}
