package advance_java.self_practice;
/**
 * This is a simple Java program to demonstrate JavaDocs.
 *
 * @author Harry
 * @version 0.1
 * @since 2002
 * @see Java docs
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class library_management_system {
    private static final int MAX_BOOKS = 100;
    private static ArrayList<Book> availableBooks = new ArrayList<>();
    private static ArrayList<String> issuedTo = new ArrayList<>();
    private static ArrayList<String> issuedOn = new ArrayList<>();
    private static Random r = new Random();
    private static Scanner sc = new Scanner(System.in);

    static class Book {
        Integer id;
        String name;
        String author;
        String genre;
        int publicationYear;

        public Book(Integer id, String name, String author, String genre, int publicationYear) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.genre = genre;
            this.publicationYear = publicationYear;
        }
    }

    private static int generaterBookID() {
        return 1000 + r.nextInt(9000); // Generates a 4-digit r number (1000 to 9999)
    }
    private static ArrayList<Book> issuedBooks = new ArrayList<>(); // ArrayList to store issued books

    public static void addBooks() {
        System.out.print("Enter the number of books need to add: ");
        int count = readIntInput();
        if (availableBooks.size() + count > MAX_BOOKS) {
            System.out.println("Cannot add more books. The library is full.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print("Enter the name of book " + (i + 1) + ": ");
            String bookName = sc.nextLine();
            System.out.print("Enter the author of book " + (i + 1) + ": ");
            String author = sc.nextLine();
            System.out.print("Enter the genre of book " + (i + 1) + ": ");
            String genre = sc.nextLine();
            System.out.print("Enter the publication year of book " + (i + 1) + ": ");
            int publicationYear = readIntInput();

            Book newBook = new Book(generaterBookID(), bookName, author, genre, publicationYear);
            availableBooks.add(newBook);
            System.out.println(bookName + " has been added to the library.");
        }
    }

    public static void issueBooks() {
        if (availableBooks.isEmpty()) {
            System.out.println("No books available in the library to issue.");
            return;
        }

        System.out.print("Enter the number of books need to issue: ");
        int count = readIntInput();

        if (count > availableBooks.size()) {
            System.out.println("Not enough books available in the library.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print("Enter the name of book " + (i + 1) + " to issue: ");
            String bookName = sc.nextLine();
            int index = findBookIndex(availableBooks, bookName);
            if (index != -1) {
                Book bookToIssue = availableBooks.get(index);
                System.out.print("Enter the name of person to whom the book is issued: ");
                String issuedToName = sc.nextLine();
                issuedTo.add(issuedToName);
                issuedBooks.add(bookToIssue); // Store Book object instead of book name
                LocalDateTime currentTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String issuedOnDate = currentTime.format(formatter);
                issuedOn.add(issuedOnDate);
                availableBooks.remove(index);
                System.out.println(bookName + " has been issued to " + issuedToName + " on " + issuedOnDate + ".");
            } else {
                System.out.println("Book not found in the library.");
            }
        }
    }

    public static void returnBooks() {
        if (issuedTo.isEmpty()) {
            System.out.println("No books have been issued to return.");
            return;
        }

        System.out.print("Enter the number of books need to return: ");
        int count = readIntInput();

        if (count > issuedTo.size()) {
            System.out.println("Invalid count. You have not issued that many books.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print("Enter the name of book " + (i + 1) + " to return: ");
            String bookName = sc.nextLine();
            int index = findBookIndex(issuedBooks, bookName);
            if (index != -1) {
                Book bookToReturn = issuedBooks.get(index);
                availableBooks.add(bookToReturn);
                issuedTo.remove(index);
                issuedOn.remove(index);
                System.out.println(bookName + " has been returned.");
            } else {
                System.out.println("Book not found in the issued books list.");
            }
        }
    }

    public static void showAvailableBooks() {
        if (availableBooks.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("Available books in the library:");
        for (int i = 0; i < availableBooks.size(); i++) {
            Book book = availableBooks.get(i);
            System.out.println((i + 1) + ". " + book.name + " by " + book.author + " (Published: " + book.publicationYear + ")");
        }

        System.out.print("Enter the name of the book to search: ");
        String bookName = sc.nextLine();
        int index = findBookIndex(availableBooks, bookName);
        if (index != -1) {
            Book book = availableBooks.get(index);
            System.out.println(bookName + " is available at position " + (index + 1) + " in the library.");
        } else {
            System.out.println("Book not found in the library or out of stock.");
        }
    }


    // Method to search for a book in the availableBooks array
    public static int findBookIndex(ArrayList<Book> books, String bookName) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).name.equalsIgnoreCase(bookName)) {
                return i;
            }
        }
        return -1;
    }



    // Method to find the index of a book name in the given array
    private static int findBookNameIndex(ArrayList<String> books, String bookName) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equalsIgnoreCase(bookName)) {
                return i;
            }
        }
        return -1;
    }


    private static int readIntInput() {
        int value = 0;
        boolean validInput = false;
        do {
            try {
                value = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.nextLine(); // Consume the invalid input
            }finally {

                System.out.println("Thank you for using the program GoodBye!!!");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (!validInput);
        sc.nextLine(); // Consume the newline character
        return value;
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add books to the library");
            System.out.println("2. Issue books");
            System.out.println("3. Return books");
            System.out.println("4. Show available books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = readIntInput();

            switch (choice) {
                case 1 -> addBooks();
                case 2 -> issueBooks();
                case 3 -> returnBooks();
                case 4 -> showAvailableBooks();
                case 5 -> System.out.println("Exiting the program. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
