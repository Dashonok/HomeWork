import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int action;
        Scanner scanner = new Scanner(System.in);
        Reader[] readers = new Reader[10];

        do {
            System.out.println("1 -- Добавить нового читателя");
            System.out.println("2 -- Читатель хочет взять книгу");
            System.out.println("3 -- Читатель хочет вернуть книгу");
            System.out.println("4 -- Вывести статус читателя");
            System.out.println("5 -- Вывести статус всех читателей");
            System.out.println("6 -- Выйти из программы");
            System.out.println("Введите номер действия:");
            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1: {
                    boolean isFull = true;
                    for (int i = 0; i < readers.length-1; i++) {
                        if (readers[i] == null) {
                            System.out.println("Введи фамилию читателя");
                            String surname=scanner.nextLine();
                            System.out.println("Введи имя читателя");
                            String name=scanner.nextLine();
                            System.out.println("Введи отчество читателя");
                            String patronymic=scanner.nextLine();
                            System.out.println("Введи факультет");
                            String faculty=scanner.nextLine();
                            System.out.println("Введи дату рождения");
                            String dateOfBirthday=scanner.nextLine();
                            System.out.println("Введи номер телефона");
                            String numberOfPhone=scanner.nextLine();
                            System.out.println("Введи номер читательского билета");
                            int numberOfTicket= scanner.nextInt();

                            Reader reader=new Reader(surname, name, patronymic, faculty, dateOfBirthday,numberOfPhone, numberOfTicket);
                            readers[i]=reader;
                            isFull = false;
                            break;
                        }
                    }
                    if (isFull) {
                        System.out.println("Количество читателей уже максимальное");
                    }
                    break;
                }

                case 2: {
                    System.out.println("Введи номер читательского билета");
                    int numberOfTicket = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] != null && readers[i].getNumberOfTicket() == numberOfTicket) {
                            System.out.println("Введи автора книги");
                            String authorName=scanner.nextLine();
                            System.out.println("Введи название книги");
                            String bookName=scanner.nextLine();
                            Book book=new Book(authorName, bookName, " ");
                            readers[i].takeBook(book);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }

                case 3: {
                    System.out.println("Введи номер читательского билета");
                    int numberOfTicket = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введи название книги");
                    String bookName=scanner.nextLine();
                    scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < readers.length-1; i++) {
                        if (readers[i] != null && readers[i].getNumberOfTicket() == numberOfTicket) {
                            readers[i].returnBook(bookName);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }

                case 4: {
                    System.out.println("Введи номер читательского билета");
                    int numberOfTicket = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] != null && readers[i].getNumberOfTicket() == numberOfTicket) {
                            readers[i].printStatus();
                            found = true;
                            System.out.println();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }

                case 5: {
                    for (int i=0; i< readers.length-1; i++){
                        if (readers[i]!=null){
                            readers[i].printStatus();
                        }
                    } break;
                    }

                case 6: {
                    System.out.println("Завершаем программу");
                    break;
                }

                default: {
                    System.out.println("Нет такой команды");
            }

        }} while (action != 6);

}}