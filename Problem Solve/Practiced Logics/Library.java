import java.util.ArrayList;
import java.util.List;

class Library {

    List<Book> books = new ArrayList<>();

    // ➕ Add Book
    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added: " + b.title);
    }

    // 📋 Show all books
    void showAllBooks() {
        System.out.println("\n--- Book List ---");
        for (Book b : books) {
            b.displayBook();
        }
    }

    // 📤 Issue Book
    void issueBook(int bookId) {
        for (Book b : books) {
            if (b.id == bookId) {

                if (b.isAvailable) {
                    b.isAvailable = false;
                    System.out.println("Book issued: " + b.title);
                } else {
                    System.out.println("Book already issued ❌");
                }
                return;
            }
        }
        System.out.println("Book not found ❌");
    }

    // 📥 Return Book
    void returnBook(int bookId) {
        for (Book b : books) {
            if (b.id == bookId) {

                if (!b.isAvailable) {
                    b.isAvailable = true;
                    System.out.println("Book returned: " + b.title);
                } else {
                    System.out.println("Book was not issued ⚠️");
                }
                return;
            }
        }
        System.out.println("Book not found ❌");
    }
}