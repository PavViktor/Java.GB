package Java_homework.Java_hw_1;
// проверить, является ли год високосным. если да - return true
// год является високосным, если он делится на 4, но не делится на 100, но делится на 400

import java.util.Scanner;

public class HW_1_4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("input Year");
        int year = iScanner.nextInt();
        iScanner.close();
        System.out.println("the year is leap: " + isLeapYear (year) );
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        return false;
    }
}