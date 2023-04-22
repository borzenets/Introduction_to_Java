import java.util.LinkedList;
import java.util.Scanner;

//Реализовать консольное приложение, которое:
//Принимает от пользователя строку вида
//text
//сохранить text в связный список.
//Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//Работать до тех пор, пока не введен stop

public class task_1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String str = "";
        int index;

        Boolean flag = true;
        while (flag){
            System.out.println("Введите строку: ");
            str = sc.nextLine();

            if(str.equals("stop")){
                flag = false;
            } else if (str.contains("print~")) {
                index = Integer.parseInt(str.split("~")[1]);
                System.out.println("Строка " + list.get(index) + " удалена");
                list.remove(index);
            } else {
                list.add(str);
            }
            System.out.println(list);
        }
    }
}