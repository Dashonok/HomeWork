import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int n = vvod.nextInt();
        int array [] = new int[n];
        int t;
        System.out.println("Введите минимальное значение");
        int min=vvod.nextInt();
        System.out.println("Введите максимальное значение");
        int max=vvod.nextInt();

        for (int i=0; i< array.length; i++){
            array[i] = (int) (Math.random() * (max - min))+min;
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i=0; i< array.length; i++ ){
            for (int j=0; j< array.length-i-1; j++){
                if (array[j]>array[j+1]){
                    t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }System.out.print(array[i]+" ");
        }
            }}