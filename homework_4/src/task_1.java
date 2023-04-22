import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) {
        int sizeList = 10;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < sizeList; i++) {
            list.addLast(i);
        }
        System.out.println(list);
        LinkedList<Integer> reverceList = reverceLinkedList(list);
        System.out.println(reverceList);
    }
    public static LinkedList<Integer> reverceLinkedList(LinkedList<Integer> list) {
        LinkedList result = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            result.addFirst(list.get(i));
        }
        return result;
    }
}