import java.util.Scanner;

class task_4 {
    public static void main(String[] args) {
        Scanner sc_term = new Scanner(System.in);
        System.out.print("Введите уравнение вида q + w = e, q, w, e > 0,\nзнаком '?' замените одинаковую цивру в первой и второй части: ");
        String equation_str = sc_term.nextLine();
        sc_term.close();
        String temp_equation_str;
        boolean isNoAnswer = true;
        for (int i = 0; i < 10; i++) {
            String item = Integer.toString(i);
            temp_equation_str = equation_str.replace("?", item);
            String[] data = temp_equation_str.split("=");
            int answer = Integer.parseInt(data[1].strip());
            int first_num = Integer.parseInt(data[0].split("\\+")[0].strip());
            int second_num = Integer.parseInt(data[0].split("\\+")[1].strip());
            if (second_num + first_num == answer) {
                System.out.printf("Ответ: %d + %d = %d", first_num, second_num, answer);
                isNoAnswer = false;
                break;
            }
        }
        if (isNoAnswer) {
            System.out.println("Нет такого уравнения");
        }
    }
}