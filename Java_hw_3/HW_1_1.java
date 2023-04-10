package Java_hw_3;

//Реализовать 2 метода класса HW_1_1

import java.util.ArrayList;
import java.util.List;

public class HW_1_1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");

        System.out.println("Исходный список: " + strings);

        List<String> stringsCopy = new ArrayList<>(strings);

        removeIntegers(stringsCopy);

        System.out.println("Удалены целые числа: " + stringsCopy);

        List<Integer> ints = convertToIntArray(strings);

        System.out.println("Список строк преобразован в список целых чисел: " + ints);

        removeEvenNumber(ints);

        System.out.println("Удалены четные числа: " + ints);

    }


    static void removeEvenNumber(List<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--)
            if (numbers.get(i) % 2 == 0)
                numbers.remove(i);

    }

    static void removeIntegers(List<String> strings) {
        for (int i = strings.size() - 1; i >= 0; i--)
            if (isNumeric(strings.get(i)))
                strings.remove(i);
    }

    static List<Integer> convertToIntArray(List<String> strArray) {
        List<Integer> intArr = new ArrayList<Integer>();
        for (String element : strArray)
            if (isNumeric(element))
                intArr.add(Integer.parseInt(element));

        return intArr;

    }

    static boolean isNumeric(String element) {
        try {
            Integer.parseInt(element);
            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }
}
