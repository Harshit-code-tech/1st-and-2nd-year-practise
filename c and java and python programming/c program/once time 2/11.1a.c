#include <stdio.h>

int main()
{
    double num1, num2, temp;

    // Taking user input for two numbers
    printf("Enter the first number: ");
    scanf("%f", &num1);

    printf("Enter the second number: ");
    scanf("%f", &num2);

    // Swapping using a third variable
    temp = num1;
    num1 = num2;
    num2 = temp;

    // Printing the swapped numbers
    printf("After swapping, the first number is: %.2f\n", num1);
    printf("After swapping, the second number is: %.2f\n", num2);

    return 0;
}
