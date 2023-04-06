import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class task_1 {
    public static String logFileName = "bubbleSort.log";
    public static void main(String[] args) {
        int[] array = {3, 4, 1, 7, 3, 5, 9, 3, 2, 10, 6};
        System.out.println(Arrays.toString(array)); 
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    writeLogToFile(Arrays.toString(array), logFileName);
                }
            }
        }
        return array;
    }

    static void writeLogToFile(String str, String fileName) {
        File file = new File(fileName);
        try {
            FileWriter writer =new FileWriter(file, true);
            writer.write(str);
            writer.write("\n");
            writer.close();
        }
        catch (Exception e){
            System.out.println("Ошибка записи в файл");
        }
    }
}