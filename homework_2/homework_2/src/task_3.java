import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class task_3 {
    private static final String fileName = "calc.log";
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double firstNum = userInput.nextDouble();
        System.out.print("Введите действие (+, -, *, /): ");
        char operator = userInput.next().charAt(0);
        System.out.print("Введите первое число: ");
        double secondNum = userInput.nextDouble();
        userInput.close();
        String result = "";
        switch (operator) {
            case '+' -> result = String.format("%.2f + %.2f = %.2f\n", firstNum, secondNum, firstNum + secondNum);
            case '-' -> result = String.format("%.2f - %.2f = %.2f\n", firstNum, secondNum, firstNum - secondNum);
            case '*' -> result = String.format("%.2f * %.2f = %.2f\n", firstNum, secondNum, firstNum * secondNum);
            case '/' -> result = String.format("%.2f / %.2f = %.2f\n", firstNum, secondNum, firstNum / secondNum);
        }
        System.out.println(result);
        writeLogFile(result, fileName);
    }
    static void writeLogFile(String str, String fileName){
        File file = new File(fileName);
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(str);
            writer.close();
        }
        catch (Exception e){
            System.out.println("Ошибка записи файла");
        }
    }
}
