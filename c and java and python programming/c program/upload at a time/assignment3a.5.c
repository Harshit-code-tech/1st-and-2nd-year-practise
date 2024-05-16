#include <stdio.h>

int main() {
    int base, exponent, result = 1;
    printf("Enter base: ");
    scanf("%d", &base);
    printf("Enter exponent: ");
    scanf("%d", &exponent);
    while (exponent--)
        result *= base;
    printf("Result: %d\n", result);
    return 0;
}
