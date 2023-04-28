package Java_homework.Java_hw_5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class HW_5_1 {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<()[]<>>}")); // true
    }

    /**
     * Дана последовательность скобочек. Проверить, что она является корректной.
     */
    static boolean isCorrectParentheses(String parentheses) {
        // Нужно завести маппинг скобочек либо ( -> ), либо ) -> ( и так для каждой пары
        // Нужно использовать Deque.
        // Открывающуюся скобку вносим в Deque (insertFirst)
        // Если встретилась закрывающаяся скобка, то (Deque#pollFirst) и сравниваем ее с
        // встретившейся
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        map.put('>', '<');
        Deque<Character> dq = new ArrayDeque<>();
        for (char c : parentheses.toCharArray()) {
            if (map.containsKey(c)) {
                if (dq.pollFirst() != map.get(c)) {
                    return false;
                }
            } else {
                dq.addFirst(c);
            }
        }
        if (!dq.isEmpty()) {
            return false;
        }
        return true;
    }
}