import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int action;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Reader> readers = new ArrayList<Reader>();

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
                    System.out.println("Введи фамилию читателя");
                    String surname = scanner.nextLine();
                    System.out.println("Введи имя читателя");
                    String name = scanner.nextLine();
                    System.out.println("Введи отчество читателя");
                    String patronymic = scanner.nextLine();
                    System.out.println("Введи факультет");
                    String faculty = scanner.nextLine();
                    System.out.println("Введи дату рождения");
                    String dateOfBirthday = scanner.nextLine();
                    System.out.println("Введи номер телефона");
                    String numberOfPhone = scanner.nextLine();
                    System.out.println("Введи номер читательского билета");
                    int numberOfTicket = scanner.nextInt();

                    readers.add(new Reader(surname, name, patronymic, faculty, dateOfBirthday, numberOfPhone, numberOfTicket));
                    break;
                }
                case 2: {
                    System.out.println("Введи номер читательского билета");
                    int numberOfTicket = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;

                    System.out.println("Введи автора книги");
                    String authorName = scanner.nextLine();
                    System.out.println("Введи название книги");
                    String bookName = scanner.nextLine();
                    String textbook="";
                    Book addbook = new Book(authorName,bookName,textbook);

                    for (Reader reader : readers)
                        if (reader.getNumberOfTicket() == numberOfTicket) {
                            reader.takeBook(addbook);
                            found = true;
                            break;
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
                    String bookName = scanner.nextLine();
                    scanner.nextLine();
                    boolean found = false;

                    for (Reader reader : readers)
                        if (reader.getNumberOfTicket() == numberOfTicket) {
                            reader.returnBook(bookName);
                            found = true;
                            break;
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

                    for (Reader reader : readers) {
                        if (reader.getNumberOfTicket() == numberOfTicket) {
                            reader.printStatus();
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
                    for (Reader reader : readers) {
                        reader.printStatus();
                        System.out.println();
                    }
                    break;
                }

                case 6: {
                    System.out.println("Завершаем программу");
                    break;
                }

                default: {
                    System.out.println("Нет такой команды");
                }

            }
        } while (action != 6);

    }}
