import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
// Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class task_2 {
    public static void main(String[] args) {
        int lenList = 10;
        ArrayList<Integer> rndList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < lenList; i++) {
            rndList.add(rnd.nextInt(1, 100));
        }
        System.out.println(rndList);
        Iterator iterator = rndList.iterator();
        while (iterator.hasNext()) {
            if (((int) iterator.next() % 2) == 0) {
                iterator.remove();
            }
        }
        System.out.println(rndList);
    }
}