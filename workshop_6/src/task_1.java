import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//1. Создайте HashSet, заполните его следующими числами:
// {1, 2, 30000, 2, 4, 5000, 6, 3}. Распечатайте содержимое данного множества.
//2. Создайте LinkedHashSet, заполните его следующими числами:
// {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.
//3. Создайте TreeSet, заполните его следующими числами:
// {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.
public class task_1 {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        LinkedHashSet<Integer> myLinkedSet = new LinkedHashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        TreeSet<Integer> myTreeSet = new TreeSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.printf("HashSet:       %s \n", myHashSet);
        System.out.printf("LinkedHashSet: %s \n", myLinkedSet);
        System.out.printf("TreeSet:       %s \n", myTreeSet);
    }
}