public class Reader {
    private String name;
    private String surname;
    private String patronymic;
    private int numberOfTicket;
    private String faculty;
   private String dateOfBirthday;
    private String numberOfPhone;
    private Book[] books=new Book[10];

    public Reader(String name, String surname, String patronymic, String faculty, String dateOfBirthday, String numberOfPhone, int numberOfTicket){
        this.name=name;
        this.surname=surname;
        this.patronymic=patronymic;
        this.numberOfTicket= numberOfTicket;
        this.faculty=faculty;
        this.dateOfBirthday=dateOfBirthday;
        this.numberOfPhone=numberOfPhone;
    }
    public int getNumberOfTicket() {
        return numberOfTicket;
    }
    public void takeBook(Book book){
        for (int i=0; i<books.length; i++){
            if (books[i]==null){
                books[i]=book;
                break;
            }
            System.out.println(name+" "+surname.substring(0, 1).toUpperCase()+". "+ patronymic.substring(0, 1).toUpperCase()+". взял книгу " + book.getName());
        }
    }
    public void printStatus(){
        StringBuilder book= new StringBuilder();
        int z=0;
        for (int i=0; i< books.length; i++){
            if (books[i]!=null){
            book.append(books[i]);
            z++;
            }}
        System.out.println(name+" "+surname.substring(0, 1).toUpperCase()+". "+ patronymic.substring(0, 1).toUpperCase()+". взял "+ z + " книги:" + book);
    }

    public void returnBook(String bookName){
        boolean found =false;
        for (int i=0; i<books.length;i++){
            if (books[i] != null && books[i].getName().equals(bookName)){
                books[i]=null;
                System.out.println(name+" "+ surname.substring(0, 1).toUpperCase()+". "+ patronymic.substring(0, 1).toUpperCase()+". вернул книгу " + bookName);
                found =true;
                break;
            } }
        if (!found){
                System.out.println(name+" "+surname.substring(0, 1).toUpperCase()+". "+ patronymic.substring(0, 1).toUpperCase()+". не хранит книгу " + bookName);
            }
        }
    }



