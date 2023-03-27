package Java_homework.Java_HW_1;
//1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

import java.util.Arrays;

public class HW_1_6 {
    public static void main(String[] args) {
    int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(invertArr(arr)));
    }

    public static int[] invertArr(int[] initialArr) {
        int[] resultArr = new int[initialArr.length];
        for (int i = 0; i < initialArr.length; i++) {
            if (initialArr[i] == 0)
                resultArr[i] = 1;
            else if (initialArr[i] == 1)
                resultArr[i] = 0;
        }
        return resultArr;


    }
}
