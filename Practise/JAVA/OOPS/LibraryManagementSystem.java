package OOPS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LibraryManagementSystem {
    private List<Book> availableBooks;
    private List<Book> issuedBooks;
    private Map<String, Book> bookMap; // Book ID to Book mapping
    private Scanner scanner;

    public LibraryManagementSystem() {
        availableBooks = new ArrayList<>();
        issuedBooks = new ArrayList<>();
        bookMap = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void addBooks() {
        System.out.print("Enter the number of books need to add: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter title of book " + (i + 1) + ": ");
            String title = scanner.nextLine();
            System.out.print("Enter author of book " + (i + 1) + ": ");
            String author = scanner.nextLine();
            System.out.print("Enter book ID of book " + (i + 1) + ": ");
            String bookId = scanner.nextLine();

            Book book = new Book(title, author, bookId);
            availableBooks.add(book);
            bookMap.put(bookId, book);
        }

        System.out.println("Books added to the library.");
    }

    public void issueBooks() {
        System.out.print("Enter the book ID to issue: ");
        String bookId = scanner.nextLine();

        Book book = bookMap.get(bookId);
        if (book != null && book.isAvailable()) {
            issuedBooks.add(book);
            book.setAvailable(false);
            System.out.println("Book with ID " + bookId + " has been issued.");
        } else {
            System.out.println("Book with ID " + bookId + " is not available for issuing.");
        }
    }

    public void returnBooks() {
        System.out.print("Enter the book ID to return: ");
        String bookId = scanner.nextLine();

        Book book = bookMap.get(bookId);
        if (book != null && !book.isAvailable()) {
            issuedBooks.remove(book);
            book.setAvailable(true);
            System.out.println("Book with ID " + bookId + " has been returned.");
        } else {
            System.out.println("Book with ID " + bookId + " is not issued or not found.");
        }
    }

    public void showAvailableBooks() {
        if (availableBooks.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Available books in the library:");
            for (Book book : availableBooks) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Book ID: " + book.getBookId());
            }
        }
    }

    public void showIssuedBooks() {
        System.out.println("Issued books in the library:");
        for (Book book : issuedBooks) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Book ID: " + book.getBookId());
        }
    }

    public void start() {
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add books to the library");
            System.out.println("2. Issue books");
            System.out.println("3. Return books");
            System.out.println("4. Show available books");
            System.out.println("5. Show issued books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()


            switch (choice) {
                case 1 -> addBooks();
                case 2 -> issueBooks();
                case 3 -> returnBooks();
                case 4 -> showAvailableBooks();
                case 5 -> showIssuedBooks();
                case 6 ->  System.out.println("Exiting the program. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        library.start();
    }
}
