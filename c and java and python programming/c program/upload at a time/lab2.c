#include <stdio.h>

int main() {
    long long num, i;
    printf("Enter a positive integer: ");
    scanf("%lld", &num);
    for (i = 63; i >= 0; i--)
        printf("%lld", (num >> i) & 1);
    return 0;
}
