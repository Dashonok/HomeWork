import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите строку");
        String str=vvod.nextLine();
        boolean empty=str.isEmpty();
        while (empty==true){
            System.out.println("Строка пустая, повторите ввод");
            str=vvod.nextLine();
            break;
        }
        System.out.println("Введите символ a");
        String a=vvod.nextLine();
        System.out.println("Введите символ b");
        String b=vvod.nextLine();
        String str1=str.replace(a,b);
        System.out.println("Измененая строка " + str1);
    }
}