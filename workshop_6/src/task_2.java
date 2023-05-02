import java.util.*;

//1. Напишите метод, который заполнит массив из 110 элементов случайными цифрами от 0 до 70.
//2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
//значений в данном массиве и верните его в виде числа с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = getRandomList(110, 70);
        System.out.println(myList);
        System.out.printf("Процент уникальных значений: %.3f", getPercentageUnique(myList));
    }
    static ArrayList<Integer> getRandomList(Integer quantityItems, Integer maxItem){
        Random rnd = new Random();
        ArrayList<Integer> rezultList = new ArrayList<>();
        for (int i = 0; i < quantityItems; i++) {
            rezultList.add(rnd.nextInt(maxItem+1));
        }
        return rezultList;
    }

    static double getPercentageUnique(ArrayList list){
        HashSet<Integer> setList = new HashSet<>(list);
        return (double) setList.size() * 100 / list.size();
    }
}
