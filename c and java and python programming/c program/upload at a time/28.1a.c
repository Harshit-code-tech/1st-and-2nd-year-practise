#include <stdio.h>

int main() {
    int d;

    // Input decimal number from user
    printf("Enter decimal number: ");
    scanf("%d", &d);

    // Convert decimal to octal and hexadecimal
    printf("Octal equivalent: %o\n", d);
    printf("Hexadecimal equivalent: %X\n", d);

    return 0;
}
