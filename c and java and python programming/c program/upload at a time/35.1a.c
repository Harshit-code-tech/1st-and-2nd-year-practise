#include <stdio.h>

int main() {
    int dayNumber;

    // Prompt the user to enter the day number
    printf("Enter the day number (1-7): ");
    scanf("%d", &dayNumber);

    // Use an else-if ladder to determine the name of the day
    if (dayNumber == 1) {
        printf("Monday\n");
    } else if (dayNumber == 2) {
        printf("Tuesday\n");
    } else if (dayNumber == 3) {
        printf("Wednesday\n");
    } else if (dayNumber == 4) {
        printf("Thursday\n");
    } else if (dayNumber == 5) {
        printf("Friday\n");
    } else if (dayNumber == 6) {
        printf("Saturday\n");
    } else if (dayNumber == 7) {
        printf("Sunday\n");
    } else {
        printf("Invalid day number.\n");
    }

    return 0;
}
