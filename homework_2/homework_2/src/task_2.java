import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class task_2 {
    public static void main(String[] args) {
        String fileName = "db.txt";
        System.out.println(fileReadToString(fileName));
    }

    static String fileReadToString(String fileName) {
        File file = new File(fileName);
        StringBuilder linesStr = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] arrLine = line.split(",|:");
                linesStr.append(String.format("Студент %s получил %s по предмету %s.\n",
                        arrLine[1].replaceAll("\"", ""),
                        arrLine[3].replaceAll("\"", ""),
                        arrLine[5].replaceAll("\"", "")));
            }
        } catch (Exception e) {
            return "Очшибка чтения файла";
        }
        return linesStr.toString();
    }
}