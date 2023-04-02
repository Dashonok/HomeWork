//2.	Создать программу, в которой проинициализировать переменную типа int, после чего вывести на экран день недели,
// соответствующий этому числу (1 – понедельник, 3 – среда и тд), если такого дня нет, вывести надпись, что такого дня нет
public class Main {
    public static void main(String[] args) {

        int dayOfWeek=3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня нет");
        }
    }
}