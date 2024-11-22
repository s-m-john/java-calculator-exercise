import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<Book> books;

    public LibrarySystem() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Book removed: " + book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
    public Book searchBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
