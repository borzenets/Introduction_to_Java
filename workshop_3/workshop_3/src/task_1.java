import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arList = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            arList.add(rnd.nextInt(0, 100));
        }
        System.out.println(arList);
        arList.sort(Comparator.naturalOrder());
        System.out.println(arList);
    }
}