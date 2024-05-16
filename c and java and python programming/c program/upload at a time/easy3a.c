#include <stdio.h>

int main() {
    int num, sum = 0;

    // prompt the user to enter a non-negative integer
    printf("Enter a non-negative integer: ");
    scanf("%d", &num);

    // loop through each digit of the number and add it to the sum
    while (num) {
        sum += num % 10; // add the rightmost digit to the sum
        num /= 10; // remove the rightmost digit
    }

    // print the sum of digits
    printf("Sum of digits = %d\n", sum);

    return 0;
}
