package Java_homework.Java_hw_1;
// напечатать строку source repeat раз

public class HW_1_3 {
    public static void main(String[] args) {
        printString("stroka", 5);
    }

    private static void printString(String source, int repeat) {

        for (int i = 0; i < repeat; i++)
            System.out.println(source);
    }

}

// Второе решение:

//import java.util.Scanner;
//
//public class HW_1_3 {
//    public static void main(String[] args) {
//        Scanner iScan = new Scanner(System.in);
//        System.out.println("Enter the text");
//        String stroka = iScan.nextLine();
//        System.out.println("count stroke");
//        int repeat = iScan.nextInt();
//        iScan.close();
//        printString(stroka, repeat);
//    }
//
//    private static void printString(String source, int repeat) {
//
//        for (int i = 0; i < repeat; i++)
//            System.out.println(source);
//    }
//
//}
