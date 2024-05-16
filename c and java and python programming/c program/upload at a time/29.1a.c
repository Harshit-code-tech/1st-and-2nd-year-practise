#include <stdio.h>

int main() {
    int num1, num2, num3, greatest;

    // Input three numbers from user
    printf("Enter three numbers: ");
    scanf("%d %d %d", &num1, &num2, &num3);

    // Find greatest number
    if (num1 >= num2 && num1 >= num3) {
        greatest = num1;
    } else if (num2 >= num1 && num2 >= num3) {
        greatest = num2;
    } else {
        greatest = num3;
    }

    // Display greatest number
    printf("Greatest number: %d\n", greatest);

    return 0;
}
