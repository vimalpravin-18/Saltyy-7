public class LibraryMain {
    public static void main(String[] args) {

        Library lib = new Library();

        // Add books
        lib.addBook(new Book(1, "Java Basics", "James"));
        lib.addBook(new Book(2, "Spring Boot", "Rod"));
        lib.addBook(new Book(3, "DSA Guide", "Mark"));

        // Show all books
        lib.showAllBooks();

        // Issue book
        lib.issueBook(1);

        // Try issuing again
        lib.issueBook(1);

        // Return book
        lib.returnBook(1);

        // Show final status
        lib.showAllBooks();
    }
}