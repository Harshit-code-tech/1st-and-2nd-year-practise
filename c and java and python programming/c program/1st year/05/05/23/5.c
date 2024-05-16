//no rt/no arg
#include <stdio.h>

void factorial() {
    int n, i, fact = 1;
    printf("Enter a positive integer: \n");
    scanf("%d", &n);
    for (i = 1; i <= n; i++) {
        fact *= i;
    }
    printf("\nFactorial of %d is %d\n", n, fact);
}

int main() {
    factorial();
    return 0;
}
