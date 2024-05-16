package OOPS;
import java.util.ArrayList;
import java.util.Scanner;

public class online_library {
    private static final int MAX_BOOKS = 100; // Maximum number of books in the library
    private static String[] availableBooks = new String[MAX_BOOKS];
    private static String[] issuedBooks = new String[MAX_BOOKS];
    private static int availableBooksCount = 0;
    private static int issuedBooksCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    // Method to add books to the library
    public static void addBooks() {
        System.out.print("Enter the number of books need to add: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        if (availableBooksCount + count > MAX_BOOKS) {
            System.out.println("Cannot add more books. The library is full.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print("Enter the name of book " + (i + 1) + ": ");
            String bookName = scanner.nextLine();
            availableBooks[availableBooksCount] = bookName;
            availableBooksCount++;
            System.out.println(bookName + " has been added to the library.");
        }
    }

    // Method to issue books from the library
    public static void issueBooks() {
        if (availableBooksCount == 0) {
            System.out.println("No books available in the library to issue.");
            return;
        }

        System.out.print("Enter the number of books need to issue: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        if (count > availableBooksCount) {
            System.out.println("Not enough books available in the library.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print("Enter the name of book " + (i + 1) + " to issue: ");
            String bookName = scanner.nextLine();
            int index = findBookIndex(availableBooks, availableBooksCount, bookName);
            if (index != -1) {
                issuedBooks[issuedBooksCount] = availableBooks[index];
                issuedBooksCount++;
                for (int j = index; j < availableBooksCount - 1; j++) {
                    availableBooks[j] = availableBooks[j + 1];
                }
                availableBooksCount--;
                System.out.println(bookName + " has been issued.");
            } else {
                System.out.println("Book not found in the library.");
            }
        }
    }

    // Method to return books to the library
    public static void returnBooks() {
        if (issuedBooksCount == 0) {
            System.out.println("No books have been issued to return.");
            return;
        }

        System.out.print("Enter the number of books need to return: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        if (count > issuedBooksCount) {
            System.out.println("Invalid count. You have not issued that many books.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print("Enter the name of book " + (i + 1) + " to return: ");
            String bookName = scanner.nextLine();
            int index = findBookIndex(issuedBooks, issuedBooksCount, bookName);
            if (index != -1) {
                availableBooks[availableBooksCount] = issuedBooks[index];
                availableBooksCount++;
                for (int j = index; j < issuedBooksCount - 1; j++) {
                    issuedBooks[j] = issuedBooks[j + 1];
                }
                issuedBooksCount--;
                System.out.println(bookName + " has been returned.");
            } else {
                System.out.println("Book not found in the issued books list.");
            }
        }
    }

    // Method to display the list of available books in the library
    public static void showAvailableBooks() {
        if (availableBooksCount == 0) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("Available books in the library:");
        for (int i = 0; i < availableBooksCount; i++) {
            System.out.println((i + 1) + ". " + availableBooks[i]);
        }
    }

    // Method to find the index of a book in the given array
    private static int findBookIndex(String[] booksArray, int count, String bookName) {
        for (int i = 0; i < count; i++) {
            if (booksArray[i].equalsIgnoreCase(bookName)) {
                return i;
            }
        }
        return -1;
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
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addBooks();
                case 2 -> issueBooks();
                case 3 -> returnBooks();
                case 4 -> showAvailableBooks();
                case 5 -> System.out.println("Exiting the program. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
