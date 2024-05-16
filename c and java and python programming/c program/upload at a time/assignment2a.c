#include <stdio.h>
int main() {
    int a, b;
    printf("Enter a positive integer: ");
    scanf("%d", &a);
    printf("The first %d natural numbers are:\n", a);
    for (b = 1; b <= a; b++) {
        printf("%d ", b);
    }
    return 0;
}
