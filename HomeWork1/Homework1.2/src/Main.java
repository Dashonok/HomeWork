//2.	Создать программу, в которой проинициализировать переменную типа int, после чего вывести на экран день недели,
// соответствующий этому числу (1 – понедельник, 3 – среда и тд), если такого дня нет, вывести надпись, что такого дня нет
public class Main {
    public static void main(String[] args) {

        int a=4;

        if (a==1) {
            System.out.println("Понедельник");
        } else if (a==2) {
            System.out.println("Вторник");
        } else if (a==3) {
            System.out.println("Среда");
        } else if (a==4) {
            System.out.println("Четверг");
        } else if (a==5) {
            System.out.println("Пятница");
        } else if (a==6) {
            System.out.println("Суббота");
        } else if (a==7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Такого дня нет");
        }
    }
}