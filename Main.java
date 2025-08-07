// Main.java
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some books
        library.addBook(new Book(1, "Java Basics", "James Gosling"));
        library.addBook(new Book(2, "Clean Code", "Robert Martin"));

        // Add some users
        library.addUser(new User(101, "Alice"));
        library.addUser(new User(102, "Bob"));

        // Show books and users
        library.displayBooks();
        library.displayUsers();

        // Issue and return operations
        library.issueBook(1, 101); // Issue book to Alice
        library.issueBook(2, 102); // Issue book to Bob
        library.issueBook(1, 102); // Try to reissue the same book
        library.returnBook(1);     // Return book
        library.returnBook(1);     // Try to return again

        // Show final status
        library.displayBooks();
    }
}
