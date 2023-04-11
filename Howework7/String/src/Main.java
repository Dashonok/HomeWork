import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //1
        String s1="3+56";
        String s2="3-56";
        String s3="3*56";
        StringBuilder compile1=new StringBuilder(s1);
        compile1.append("=").append(3+56);
        System.out.println(compile1.toString());

        StringBuilder compile2=new StringBuilder(s2);
        compile2.append("=").append(3-56);
        System.out.println(compile2.toString());

        StringBuilder compile3=new StringBuilder(s3);
        compile3.append("=").append(3*56);
        System.out.println(compile3.toString());

        compile2.replace(4,5," равно ");
        System.out.println(compile2.toString());
        //2
        String regular= "^\\w+\\w.com$";
        Scanner vvod=new Scanner(System.in);
        System.out.println("Введи текст");
        String text=vvod.nextLine();
        System.out.println(Pattern.matches(regular,text));
        //3
        String find="ahb acb aeb aeeb adcb axeb";
        Pattern pattern=Pattern.compile("a\\wb");
        Matcher matcher=pattern.matcher(find);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }
        System.out.println();
        //4
        String find2="ab abab abab abababab abea";
        Pattern pattern1=Pattern.compile("(ab)+");
        Matcher matcher1=pattern1.matcher(find2);
        while (matcher1.find()){
            System.out.print(matcher1.group()+" ");
        }
        //5
        Scanner vvod2=new Scanner(System.in);
        System.out.println("Введи дату");
        String date=vvod2.nextLine();
        String regular1="((1[0-9]{3})|(20(0|1)[0-2]))\\\\/((0[0-9])|(1[0-2]))\\\\/([0-2][0-9]|30) (((0|1)[0-9])|(2[0-4])):([0-5][0-9])";
        if (date.matches(regular1)){
            System.out.println(date+" - существует.");
        } else {
            System.out.println(date+" - не существует.");
        }
    }
}