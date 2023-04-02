import java.util.Scanner;

class task_1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = userInput.nextInt();
        int triangular = 0;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            triangular += i;
            factorial *= i;
        }

        System.out.printf("Треугольное чило - %d\nФакториал - %d\n", triangular, factorial);
    }
}