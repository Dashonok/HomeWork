import java.util.ArrayList;

public class Reader {
    private String name;
    private String surname;
    private String patronymic;
    private int numberOfTicket;
    private String faculty;
    private String dateOfBirthday;
    private String numberOfPhone;
    private ArrayList<Book> books = new ArrayList<Book>();

    public Reader(String name, String surname, String patronymic, String faculty, String dateOfBirthday, String numberOfPhone, int numberOfTicket) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.numberOfTicket = numberOfTicket;
        this.faculty = faculty;
        this.dateOfBirthday = dateOfBirthday;
        this.numberOfPhone = numberOfPhone;
    }
    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void takeBook(Book book){
        books.add(book);
        System.out.println(name+" "+surname.substring(0, 1).toUpperCase()+". "+ patronymic.substring(0, 1).toUpperCase()+". взял книгу " + book);
    }
    public void printStatus(){
        System.out.println(name+" "+surname.substring(0, 1).toUpperCase()+". "+ patronymic.substring(0, 1).toUpperCase()+". взял книг:" + books.size());
        if (books.size()!=0){
            for (Book book : books) {
                System.out.print(book.getbookName() + ".");
            }
        }
    }
    public void returnBook(String bookName){
        if (books.contains(bookName)){
            books.remove(bookName);
            System.out.println(name+" "+ surname.substring(0, 1).toUpperCase()+". "+ patronymic.substring(0, 1).toUpperCase()+". вернул книгу " + bookName);
        } else  {
            System.out.println(name+" "+surname.substring(0, 1).toUpperCase()+". "+ patronymic.substring(0, 1).toUpperCase()+". не хранит книгу " + bookName);
        }
    }
}