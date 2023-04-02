//1.	Создать программу, проверяющую и сообщающую на экран, является ли целое число, записанное в переменную n, чётным либо нечётным

public class Main {
    public static void main(String[] args) {

        int n;
        n=5;
        if (n%2 != 0) {
            System.out.println("Число n нечетное");
        } else {
            System.out.println("Число n четное");
        }
    }
}