//Дано четное число N (>0) и символы c1 и c2. Написать метод,
// который вернет строку длины N,
//которая состоит из чередующихся символов c1 и c2, начиная с c1.
//Пример:
//6
//a b
//ababab

public class task_1 {
    public static void main(String[] args) {
        System.out.println(str_concat(6, "r", "z"));
    }

    static String str_concat(int number, String firstChar, String secondChar) {
        StringBuilder result = new StringBuilder();
        StringBuilder twoChars = new StringBuilder (firstChar + secondChar);
        for (int i = 0; i < number / 2;  i++) {
            result.append(twoChars);
        }
        return result.toString();
    }
}