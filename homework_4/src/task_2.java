import java.util.LinkedList;

public class task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            enqueue(list, i);
        }
        System.out.println(list);

        System.out.println(dequeue(list));
        System.out.println(list);

        System.out.println(first(list));
        System.out.println(list);

    }
    public static void enqueue(LinkedList<Integer> list, int addItem){
        list.addLast(addItem);
    }
    public static int dequeue(LinkedList<Integer> list){
        return list.pollFirst();
    }
    public static int first(LinkedList<Integer> list){
        return list.getFirst();
    }
}