//with rt/ no arg
#include <stdio.h>

int factorial() {
    int n, i, fact = 1;
    printf("Enter a positive integer: \n");
    scanf("%d", &n);
    for (i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}

int main() {
    int result;
    result = factorial();
    printf("\nFactorial is %d\n", result);
    return 0;
}
