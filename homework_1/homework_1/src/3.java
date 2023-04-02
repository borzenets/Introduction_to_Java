import java.util.Scanner;

class task_3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double firstNum = userInput.nextDouble();
        System.out.print("Введите действие (+, -, *, /): ");
        char operator = userInput.next().charAt(0);
        System.out.print("Введите первое число: ");
        double secondNum = userInput.nextDouble();
        userInput.close();
        switch (operator) {
            case '+' -> System.out.printf("%.3f + %.3f = %.3f", firstNum, secondNum, firstNum + secondNum);
            case '-' -> System.out.printf("%.3f - %.3f = %.3f", firstNum, secondNum, firstNum - secondNum);
            case '*' -> System.out.printf("%.3f * %.3f = %.3f", firstNum, secondNum, firstNum * secondNum);
            case '/' -> System.out.printf("%.3f / %.3f = %.3f", firstNum, secondNum, firstNum / secondNum);
        }
    }
}