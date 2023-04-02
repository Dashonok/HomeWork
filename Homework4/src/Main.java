import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone ph1=new Phone(10, "Huawei", 118);
        Phone ph2=new Phone(5, "Samsung", 165);
        Phone ph3=new Phone(7, "Nokia", 130 );

        System.out.println("Телефон 1: номер "+ph1.getNumber()+", модель "+ph1.getModel()+", вес "+ph1.getWeight());
        System.out.println("Телефон 2: номер "+ph2.getNumber()+", модель "+ph2.getModel()+", вес "+ph2.getWeight());
        System.out.println("Телефон 3: номер "+ph3.getNumber()+", модель "+ph3.getModel()+", вес "+ph3.getWeight());
        ph1.receiveCall("Иван");
        ph2.receiveCall("Олег");
        ph3.receiveCall("Павел");
        ph2.receiveCall("Олег", 447896598);
        ph3.sendMessage(295684975, 441234567, 334567812, 257894561);

    }
}