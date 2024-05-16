#include <stdio.h>

int main() {
    int num, sum = 0, count = 0;

    printf("Enter 10 two-digit integers: \n");

    // loop through 10 integers
    for (int i = 1; i <= 10; i++) {
        // read integer from user
        if (scanf("%d", &num) != 1) { // error handling for invalid input
            printf("Error: Invalid input\n");
            return 1; // exit program with non-zero exit code
        }

        // add positive integers to sum if sum < 999
        if (num > 0 && sum + num <= 999) {
            sum += num;
            count++; // increment count of values added
        }
    }

    // print sum of positive values and number of values added
    printf("Sum of positive values = %d\nNumber of values added = %d\n", sum,count);


    return 0; // exit program with zero exit code
}
