package Java_homework.Java_HW_1;
// проверить, что х положительное

public class HW_1_2 {
    public static void main(String[] args) {
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(75)); // true
        System.out.println(isPositive(-3)); // false
        System.out.println(isPositive(-77)); // false
    }

    public static boolean isPositive(int x) {
//        return x > 0; // первый вариант решения
        if (x > 0) // второй вариант решения
            return true;
        return false;
    }
}

