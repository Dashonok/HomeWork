import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner vvod=new Scanner(System.in);
            System.out.println("Введи ФИО");
            String name=vvod.nextLine();
            System.out.println("Введи возраст");
            int age=vvod.nextInt();
            if (age>100 || age<0){
                throw new IncorrectInfoException("Некорректный возраст",age, name);
            } else if (name.length()>200) {
                throw new IncorrectInfoException("Некорректный ввод", age, name);
            }
            System.out.println("ФИО: " +name);
            System.out.println("Возраст: "+age);
        }
        catch (IncorrectInfoException e){
            e.printStackTrace();
        }
    }
}