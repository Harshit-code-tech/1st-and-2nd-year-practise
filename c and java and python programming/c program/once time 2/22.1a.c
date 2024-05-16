#include <stdio.h>

int main() {
    int num1, num2, product = 0, i, j;
    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);
    for (i = 1; i <= num2; i++) {
        for (j = 1; j <= num1; j++) {
            product++;
        }
    }
    printf("Product of %d and %d is %d", num1, num2, product);
    return 0;
}
