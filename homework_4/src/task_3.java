import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class task_3 {
    public static <string> void main(String[] args) {
        Deque<Double> results = new ArrayDeque<>();
        boolean flug = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double firstNum = sc.nextDouble();
        double secondNum = 0;
        while (flug) {
            System.out.print("Введите действие (+, -, *, /, \"Cancel\" или \"Quit\"): ");
            String operator = sc.next().strip().toLowerCase();
            if (operator.equals("cancel")){
                if(results.size() == 1){
                    System.out.println("Вы вернулись к первому значению, \"Отмена\" не возможна");
                    System.out.println(firstNum);
                } else {
                    results.removeLast();
                    firstNum = results.getLast();
                    System.out.println(firstNum);
                }
            } else if (operator.equals("quit")){
                flug = false;
            } else if (operator.equals("+") | operator.equals("-") | operator.equals("*") | operator.equals("/")) {
                System.out.print("Введите второе число: ");
                secondNum = sc.nextDouble();
                if (secondNum == 0 & operator.equals("/")){
                    System.out.println("На 0 делить нельзя.");
                } else {
                    switch (operator.charAt(0)) {
                        case '+' -> results.addLast(firstNum + secondNum);
                        case '-' -> results.addLast(firstNum - secondNum);
                        case '*' -> results.addLast(firstNum * secondNum);
                        case '/' -> results.addLast(firstNum / secondNum);
                    }
                    firstNum = results.getLast();
                    System.out.println(results.getLast());
                }
            }
        }
        sc.close();
    }
}