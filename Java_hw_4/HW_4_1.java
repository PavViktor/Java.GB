package Java_homework.Java_hw_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HW_4_1 {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите данные: ");
            String user_input = scanner.nextLine();
            if (user_input.equals("print")) {
                Collections.reverse(lines);
                System.out.println(lines);
                Collections.reverse(lines);
            } else if (user_input.equals("revert")) {
                if (lines.size() > 0) {
                    lines.remove(lines.size() - 1);
                }
            } else if (user_input.equals("exit")) {
                break;
            } else {
                lines.add(user_input);
            }
        }
        scanner.close();
    }
}
