import java.util.ArrayList;

class Book {
    int bookId;
    String title;
    boolean isIssued;

    Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isIssued = false;
    }

    void display() {
        String status = isIssued ? "Issued" : "Available";
        System.out.println("Book ID: " + bookId + " | Title: " + title + " | Status: " + status);
    }
}

class User {
    int userId;
    String name;

    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    void display() {
        System.out.println("User ID: " + userId + " | Name: " + name);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added: " + b.title);
    }

    void addUser(User u) {
        users.add(u);
        System.out.println("User registered: " + u.name);
    }

    void issueBook(int bookId, int userId) {
        for (Book b : books) {
            if (b.bookId == bookId) {
                if (b.isIssued) {
                    System.out.println("Book already issued.");
                } else {
                    b.isIssued = true;
                    System.out.println("Book '" + b.title + "' issued to user " + userId);
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void returnBook(int bookId) {
        for (Book b : books) {
            if (b.bookId == bookId) {
                if (!b.isIssued) {
                    System.out.println("This book wasn't issued.");
                } else {
                    b.isIssued = false;
                    System.out.println("Book '" + b.title + "' returned successfully.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        System.out.println("\n--- Book List ---");
        for (Book b : books) {
            b.display();
        }
    }

    void showAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No users registered.");
            return;
        }
        System.out.println("\n--- Registered Users ---");
        for (User u : users) {
            u.display();
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library lib = new Library();

        // Adding some books
        lib.addBook(new Book(101, "Java Programming"));
        lib.addBook(new Book(102, "Data Structures"));
        lib.addBook(new Book(103, "Operating Systems"));

        // Adding users
        lib.addUser(new User(1, "Mamatha"));
        lib.addUser(new User(2, "Ravi"));

        System.out.println();
        lib.showAllBooks();

        System.out.println();
        lib.issueBook(101, 1);
        lib.issueBook(101, 2); // already issued

        System.out.println();
        lib.showAllBooks();

        System.out.println();
        lib.returnBook(101);
        lib.showAllBooks();
    }
}