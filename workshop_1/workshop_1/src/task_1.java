// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 0, 1, 1, 1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;

            }
        }
        System.out.println("вывести максимальное количество подряд идущих: " + max);
        
        // Вариант решения от перподавателя
        
//        int[] arr = new int[]{1, 1, 1, 0, 1, 1, 1, 1};
//        int kolvo = 0;
//        int kolvo_max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) {
//                kolvo += 1;
//            }
//            else  {
//                if (kolvo > kolvo_max){
//                    kolvo_max = kolvo;
//                }
//                kolvo = 0;
//
//            }
//        }
//        if (kolvo > kolvo_max) {
//            kolvo_max = kolvo;
//        }
//        System.out.println(kolvo_max);
    }
}