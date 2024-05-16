//no rt/ with arg
#include <stdio.h>

void factorial(int n) {
    int i, fact = 1;
    for (i = 1; i <= n; i++) {
        fact *= i;
    }
    printf("\nFactorial of %d = %d\n", n, fact);
}

int main() {
    int x;
    printf("Enter a positive integer: \n");
    scanf("%d", &x);
    factorial(x);
    return 0;
}
