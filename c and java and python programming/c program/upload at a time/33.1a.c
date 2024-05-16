#include <stdio.h>

int main() {
    int marks;

    // Input marks from user
    printf("Enter your marks: ");
    scanf("%d", &marks);

    // Calculate grade based on marks using switch case
    switch (marks / 10) {
        case 10:
        printf("Your grade is O\n");
            break;
        case 9:
            printf("Your grade is O\n");
            break;
        case 8:
            printf("Your grade is A+\n");
            break;
        case 7:
            printf("Your grade is A\n");
            break;
        case 6:
            printf("Your grade is B+\n");
            break;
        case 5:
            printf("Your grade is B\n");
            break;
        case 4:
            printf("Your grade is C\n");
            break;
        default:
            printf("Your grade is F\n");
            break;
    }

    return 0;
}
