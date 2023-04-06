import java.util.*;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>(Arrays.asList("Меркурий",
                "Венера", "Марс", "Нептун", "Уран", "Сатурн", "Марс",
                "Юпитер", "Меркурий", "Венера", "Земля"));
        Set<String> planetsSet = new HashSet<>(planets);
        for (String item : planetsSet) {
            System.out.printf("%s - %d\n", item, Collections.frequency(planets, item));
        }
    }
}
