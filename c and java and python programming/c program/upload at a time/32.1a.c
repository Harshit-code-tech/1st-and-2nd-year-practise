#include <stdio.h>

int main() {
    int marks;

    // Input marks from user
    printf("Enter your marks: ");
    scanf("%d", &marks);

    // Calculate grade based on marks
    if (marks >= 90 && marks <= 100) {
        printf("Your grade is O\n");
    } else if (marks >= 80 && marks < 90) {
        printf("Your grade is A+\n");
    } else if (marks >= 70 && marks < 80) {
        printf("Your grade is A\n");
    } else if (marks >= 60 && marks < 70) {
        printf("Your grade is B+\n");
    } else if (marks >= 50 && marks < 60) {
        printf("Your grade is B\n");
    } else if (marks >= 40 && marks < 50) {
        printf("Your grade is C\n");
    } else {
        printf("Your grade is F\n");
    }

    return 0;
}
