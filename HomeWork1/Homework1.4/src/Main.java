public class Main {
    public static void main(String[] args) {

        int year=2020;

        if (year % 4 == 0){
              if (year % 100 == 0 && year % 400 != 0){
            System.out.println( year + " Год НЕ високосный");
             } else {
              System.out.println( year + " Год високосный");
              }
             } else{
           System.out.println(year + " Год НЕ високосный");
             }
    }
	}


