package Java_homework.Java_hw_2;
//1 Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//Пример. (n = 6, c1='a', c2='b') -> "ababab"
//(n = 8, c1='x', c2='y') -> "xyxyxyxy"

public class HW_2_1 {
    public static void main(String[] args) {
        System.out.println(buildString(8, 'x', 'y'));
    }

    static String buildString(int n, char c1, char c2) {
        String string = "";
        for (int i = 0; i < n; i++) {
            string += (i % 2 == 0) ? c1 : c2;
        }
        return string;
    }
}


