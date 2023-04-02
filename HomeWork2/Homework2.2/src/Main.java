import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner vvod = new Scanner(System.in);
        int l;
        do {
            System.out.println("Введите размер массива ");
            l =vvod.nextInt();
        } while (l<=0);
        int min;
        int max;
        do {
            System.out.println("Задайте нижний диапазон ");
            min = vvod.nextInt();
            System.out.println("Задайте верхний диапазон");
            max = vvod.nextInt();
        } while (min>max);

        int array[] = new int[l];

        for (int i=0; i< array.length; i++) {
            double r = (int) ((Math.random() * (max - min))+min);
            array[i]=(int)r;
        }
        for (int z: array){
        System.out.print(z+ " ");
        }

    }
}