package Java_homework.Java_HW_1;
//3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
// *Также заполнить элементы побочной диагонали

import java.util.Scanner;

public class HW_1_8 {
    public static void main(String[] args) {
        System.out.println("Set the size of the array:");
        Scanner iScanner = new Scanner(System.in);
        int size = iScanner.nextInt();
        iScanner.close();

        int[][] array = new int[size][size];


        firstDiagonal(array);

        print(array);

        secondDiagonal(array);

        print(array);

    }

    public static void print(int[][] arr) {
        System.out.println("===========================");
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    public static void firstDiagonal(int[][] arr) {

        int size = arr[0].length;

        int j = 0;

        for (int i = 0; i < size; i++) {
            arr[i][j] = 1;
            j++;

        }

    }

    public static void secondDiagonal(int[][] arr) {

        int size = arr[0].length;

        int j = size - 1;

        for (int i = 0; i < size; i++) {
            arr[i][j] = 1;
            j--;

        }

    }
}


