import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class task_3 {
    public static void main(String[] args) {
        ArrayList<Object> heap = new ArrayList<>(Arrays.asList(12, "строка", "Нептун", 123, "Земля", 98));
        System.out.println(heap);
        Iterator<Object> iterator = heap.iterator();
        while (iterator.hasNext()){
            if(iterator.next() instanceof Integer) {
                iterator.remove();
            }
        }
        System.out.println(heap);
    }
}
