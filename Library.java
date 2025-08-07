// Library.java
import java.util.*;

public class Library {
    private Map<Integer, Book> books;
    private Map<Integer, User> users;

    public Library() {
        books = new HashMap<>();
        users = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void issueBook(int bookId, int userId) {
        Book book = books.get(bookId);
        User user = users.get(userId);

        if (book == null) {
            System.out.println("Book not found.");
        } else if (user == null) {
            System.out.println("User not found.");
        } else if (book.isIssued()) {
            System.out.println("Book is already issued.");
        } else {
            book.issue();
            System.out.println("Book '" + bookId + "' issued to " + user.getName());
        }
    }

    public void returnBook(int bookId) {
        Book book = books.get(bookId);

        if (book == null) {
            System.out.println("Book not found.");
        } else if (!book.isIssued()) {
            System.out.println("Book is not issued.");
        } else {
            book.returned();
            System.out.println("Book '" + bookId + "' returned.");
        }
    }

    public void displayBooks() {
        System.out.println("\nBooks in Library:");
        for (Book book : books.values()) {
            System.out.println(book.getDetails());
        }
    }

    public void displayUsers() {
        System.out.println("\nUsers:");
        for (User user : users.values()) {
            System.out.println(user.getUserId() + ": " + user.getName());
        }
    }
}
