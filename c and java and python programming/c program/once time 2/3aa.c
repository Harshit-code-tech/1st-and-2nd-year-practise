#include <stdio.h>

int main() {
    int num1, num2;
    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);

    // Perform all arithmetic operations
    printf("+: %d\n", num1 + num2);
    printf("-: %d\n", num1 - num2);
    printf("Multiplication: %d\n", num1 * num2);
    printf("Division: %d\n", num1 / num2);
    printf("Modulus: %d\n", num1 % num2);
    printf("Bitwise AND: %d\n", num1 & num2);
    printf("Bitwise OR: %d\n", num1 | num2);
    printf("Bitwise XOR: %d\n", num1 ^ num2);
    printf("Bitwise Left Shift: %d\n", num1 << num2);
    printf("Bitwise Right Shift: %d\n", num1 >> num2);

    return 0;
}
