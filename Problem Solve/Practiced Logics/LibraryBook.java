class Book {

    int id;
    String title;
    String author;
    boolean isAvailable;

    // Constructor
    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // default available
    }

    void displayBook() {
        System.out.println(
            "ID: " + id +
            ", Title: " + title +
            ", Author: " + author +
            ", Available: " + isAvailable
        );
    }
}