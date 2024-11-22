public class Main {
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        // Adding books to the libary
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));
        library.addBook(new Book("1984", "George Orwell", "9780451524935"));

        // display all books
        library.displayBooks();

        //Search for a book by ISBN
        String searchIsbn = "9780743273565";
        Book foundBook = library.searchBookByIsbn(searchIsbn);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("No book found with ISBN: " + searchIsbn);
        }
    }
    
}
