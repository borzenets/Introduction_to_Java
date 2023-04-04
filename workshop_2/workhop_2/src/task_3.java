import java.util.Scanner;

// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).
public class task_3 {
    public static void main(String[] args) {
        Scanner scTerm = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str = scTerm.nextLine();
        scTerm.close();
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1])
                return false;
        }
        return true;
    }
}
