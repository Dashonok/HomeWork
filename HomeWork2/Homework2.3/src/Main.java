import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int n = vvod.nextInt();
        int array [] = new int[n];
        int iMax=0;
        System.out.println("Введите минимальное значение");
        int min=vvod.nextInt();
        System.out.println("Введите максимальное значение");
        int max=vvod.nextInt();

        for (int i=0; i< array.length; i++){
            array[i] = (int) (Math.random() * (max - min))+min;
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i=0; i<array.length; i++){
            if (array[i]>array[iMax]){
                iMax=i;
            }
        }
        System.out.println("Максимальный элемент "+ array[iMax] );
        System.out.println("Индекс элемента " + iMax );
    }
}