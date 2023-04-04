// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcddaaa. a4b3cd2a3

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scTerm = new Scanner(System.in);
        System.out.print("Введите строку символов: ");
        String str = scTerm.nextLine();
        scTerm.close();
        System.out.println(compressString(str));
    }

    static String compressString(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                count++;
            } else {
                result.append(charArray[i]);
                if (count > 1) {
                    result.append(Integer.toString(count));
                }
                count = 1;
            }
        }
        result.append(charArray[charArray.length - 1]);
        if (charArray[charArray.length - 1] == charArray[charArray.length - 2]) {
            result.append(Integer.toString(count));
        }
        return result.toString();
    }
}