#include <stdio.h>

int main() {
    unsigned long long m, i = 1, f = 1;
    printf("Enter a non-negative integer m: ");
    scanf("%llu", &m);
    while (i <= m) {
        f *= i++;
        printf("%llu! = %llu\n", i-1, f);
    }
    return 0;
}
