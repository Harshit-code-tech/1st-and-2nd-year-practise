#include <stdio.h>

int main() {
    int a, b, c;

    // Prompt user to enter three integer values
    printf("Enter three integer values: \n");

    // Read the three integer values from the user input
    scanf("%d %d %d", &a, &b, &c);

    // Calculate the sum of the three integers
    int sum = a + b + c;

    // Calculate the average of the three integers
    float average = (float)sum / 3;

    // Find the largest of the three integers using ternary operator
    int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

    // Find the smallest of the three integers using ternary operator
    int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);

    // Print the sum, average, largest, and smallest values
    printf("Sum: %d\nAverage: %.2f\nLargest: %d\nSmallest: %d\n", sum, average, largest, smallest);

    // Return 0 to indicate successful execution of the program
    return 0;
}
