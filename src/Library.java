import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    public Library() {
        books = new ArrayList<>(5);
    }
    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    public Library(Library library) {
        this.books = new ArrayList<>();
        for (Book book : library.books) {
            this.books.add(new Book(book));
        }
    }
    public ArrayList<Book> searchBook(String search) {
        ArrayList<Book> seachName = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(search.toLowerCase())) {
                seachName.add(book);
            }
        }
        return seachName;
    }
    public boolean equals(Library library) {
        if (this == library){
            return true;
        }else return false;
    }
    public String toString() {
        String string = "Library:\n";
        for (Book book : books) {
            string += book.toString() + "\n";
        }
        return string;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public Book getBook(int index) {
        return books.get(index);
    }
    public void setBook(int index, Book book) {
        books.set(index, book);
    }
}
