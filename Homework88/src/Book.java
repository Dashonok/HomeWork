public class Book {

    private String bookName;
    private String authorName;
    private String textbook;

    public Book(String bookName, String authorName, String textbook){
        this.bookName=bookName;
        this.authorName=authorName;
        this.textbook=textbook;
    }
      public String getbookName() {
        return bookName;
    }
}