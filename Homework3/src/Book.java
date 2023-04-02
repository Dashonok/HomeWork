public class Book {

    String bookName;
    String authorName;
    String text;

    public Book(String bookName, String authorName, String text){
        this.bookName=bookName;
        this.authorName=authorName;
        this.text=text;
    }
    public String getName(){
        return bookName;
    }
    
}
