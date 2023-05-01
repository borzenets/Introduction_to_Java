import java.util.HashMap;
import java.util.Map;
public class task_2 {
    //Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
//Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
//(Например, add - egg изоморфны)
//2. буква может не меняться, а остаться такой же. (Например, note - code)
//Пример 1:
//Input: s = "foo", t = "baar"
//f: b
//o: a
//Output: false
//Пример 2:
//Input: s = "paper", t = "title"
//p: t
//a: i
//e: l
//r: e
    public static void main(String[] args) {
        String firstStr = "123";
        String secondStr = "556";

        System.out.println(isIsomorph(firstStr, secondStr));
    }

    static boolean isIsomorph(String firstStr, String secondStr) {
        if (firstStr.length() != secondStr.length()) {
            return false;
        }

        Map<Character, Character> dict = new HashMap<>();

        for (int i = 0; i < firstStr.length(); i++) {
            if (dict.containsKey(firstStr.charAt(i))) {
                if (dict.get(firstStr.charAt(i)) != secondStr.charAt(i)) {
                    return false;
                }
            } else {
                if (dict.containsValue(secondStr.charAt(i))) {
                    return false;
                } else {
                    dict.put(firstStr.charAt(i), secondStr.charAt(i));
                }
            }
        }
        return true;
    }
}