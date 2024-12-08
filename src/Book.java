public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    //Default constructor
    public Book() {

    }

    //Constructor with the title
    public Book(String title) {
        this.title = title;
    }

    // Constructor with all the data members
    public Book(String title, String author, double price, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    //Copy constructor
    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.price = book.price;
        this.publisher = book.publisher;
        this.isbn = book.isbn;
    }

    public int checkIsbnStatus() {
        if (isbn.length() == 17) { //checking ISBN10
            return 0;
        } else if (isbn.length() == 13) { //checking ISBN13
            return 1;
        } else return -1;
    }


    public String toTitleCase() {
       title=" "+title.trim();
       for(int i=0;i<title.length();i++) {
           if(title.charAt(i)==' '){
               title=title.substring(0,i+1)+title.substring(i+1,i+2).toUpperCase()+title.substring(i+2);
           }
       }
        return title;
    }


    public String toString() {
        return String.format("Title: %s \nAuthor: %s \nPrice: %.2f \nPublisher: %s \nISBN: %s", title, author, price, publisher, isbn);
    }
    public boolean equals(Book book) {
        if (this.title == book.title && this.author == book.author && this.price == book.price && this.publisher == book.publisher && this.isbn == book.isbn) {
            return true;
        }else return false;
    }
}




