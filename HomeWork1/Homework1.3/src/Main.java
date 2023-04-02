//3.	Даны три числа, каждое в своей переменной. Найти сумму двух наибольших из них
public class Main {
    public static void main(String[] args) {

        int a=3;
        int b=4;
        int c=5;

        if (a>c && b>c) {
            System.out.println(a+b);
        } else if (a>b && c>b) {
            System.out.println(a+c);
        } else  {
            System.out.println(b+c);
        }
    }
}