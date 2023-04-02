import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите строку");
        String str=vvod.nextLine();
        System.out.println("Введите символ");
        String s=vvod.nextLine();
        int z=0;
        char[] array=str.toCharArray();
        char[] arrays=s.toCharArray();
        for (int i=0;i< array.length; i++){
            if (array[i]==arrays[0]){
                z++;
            }}
        System.out.println("Строка " + str + ", символ " + s + ", результат: "+ z);
    }}