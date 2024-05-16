#include <stdio.h>
#include <string.h>

// Define the structure for a book
struct Book {
    char title[100];
    char author[100];
    int year;
};

int main() {
    // Declare an array of Book structures to store details of 10 books
    struct Book books[10];

    // Read details for each book
    for (int i = 0; i < 10; i++) {
        printf("Enter details for Book %d:\n", i + 1);
        
        printf("Title: ");
        fgets(books[i].title, sizeof(books[i].title), stdin);
        books[i].title[strcspn(books[i].title, "\n")] = '\0'; // Remove newline
        
        printf("Author: ");
        fgets(books[i].author, sizeof(books[i].author), stdin);
        books[i].author[strcspn(books[i].author, "\n")] = '\0'; // Remove newline
        
        printf("Year: ");
        scanf("%d", &books[i].year);
        getchar(); // Consume the newline left in the input buffer
    }

    // Display details of each book
    printf("\nBook Details:\n");
    for (int i = 0; i < 10; i++) {
        printf("Book %d:\n", i + 1);
        printf("Title: %s\n", books[i].title);
        printf("Author: %s\n", books[i].author);
        printf("Year: %d\n", books[i].year);
        printf("\n");
    }

    return 0;
}
