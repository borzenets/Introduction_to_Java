import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Asus", "N5", "i5",8, 512,"Win10pro", "black"));
        laptops.add(new Laptop("Apple", "MacBookPro", "i7",16, 1024,"MacOS", "silver"));
        laptops.add(new Laptop("Acer", "Swift 3", "i3",4, 256,"Win10pro", "black"));
        laptops.add(new Laptop("Dell", "IXP", "i9",32, 2048,"Win11pro", "red"));
        laptops.add(new Laptop("HP", "Pavilion", "i7",16, 512,"DOS", "black"));

        int userInput = mainMenu();
        Scanner input = new Scanner(System.in);
        int min;
        String str = "";
        Map<String, Integer> paramDict = new LinkedHashMap<>();
        switch (userInput) {
            case 1 -> {
                System.out.print("Введите минимальное значение ОЗУ: ");
                min = input.nextInt();
                for (Laptop laptop : laptops) {
                    if (laptop.getRam() >= min) {
                        System.out.println(laptop.getInfo());
                    }
                }
            }
            case 2 -> {
                System.out.print("Введите минимальное значение ЖД: ");
                min = input.nextInt();
                for (Laptop laptop : laptops) {
                    if (laptop.getRom() >= min) {
                        System.out.println(laptop.getInfo());
                    }
                }
            }
            case 3 -> {
                int i = 1;
                for (Laptop laptop : laptops) {
                    if (!paramDict.containsKey(laptop.getOs())) {
                        paramDict.put(laptop.getOs(), i);
                        i++;
                    }
                }
                System.out.print("Выберите подходящую ОС: \n");
                for (var os : paramDict.entrySet()) {
                    System.out.println(os.getValue() + " - " + os.getKey());
                }
                min = input.nextInt();
                for (var os : paramDict.entrySet()) {
                    if (os.getValue() == min) {
                        str = os.getKey();
                        paramDict.clear();
                        break;
                    }
                }
                for (Laptop laptop : laptops) {
                    if (laptop.getOs().equals(str)) {
                        System.out.println(laptop.getInfo());
                    }
                }
            }
            case 4 -> {
                int c = 1;
                for (Laptop laptop : laptops) {
                    if (!paramDict.containsKey(laptop.getColor())) {
                        paramDict.put(laptop.getColor(), c);
                        c++;
                    }
                }
                System.out.print("Выберите цвет: \n");
                for (var color : paramDict.entrySet()) {
                    System.out.println(color.getValue() + " - " + color.getKey());
                }
                min = input.nextInt();
                for (var color : paramDict.entrySet()) {
                    if (color.getValue() == min) {
                        str = color.getKey();
                        paramDict.clear();
                        break;
                    }
                }
                for (Laptop laptop : laptops) {
                    if (laptop.getColor().equals(str)) {
                        System.out.println(laptop.getInfo());
                    }
                }
            }
        }
    }
    static Integer mainMenu(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int result = 0;
        while (flag) {
            System.out.println("""
                    Введите цифру, соответствующую необходимому критерию:
                    1 - ОЗУ
                    2 - Объем ЖД
                    3 - Операционная система
                    4 - Цвет
                    """);
            result = sc.nextInt();
            if (result < 5 && result > 0)
                flag = false;
        }
        return result;
    }
}