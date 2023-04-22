import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
public class task_2 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        Scanner sc =new Scanner(System.in);
        String str ="";
        boolean flag = true;

        while (flag){
            System.out.print("Введите строку: ");
            str = sc.nextLine();
            if(str.contains("print")){
                while (!dq.isEmpty()){
                    System.out.println(dq.pollLast());
                }
                flag = false;
            } else {
                dq.addLast(str);
            }
            System.out.println(dq);
        }
        sc.close();
    }
}