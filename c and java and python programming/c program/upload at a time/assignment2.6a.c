#include <stdio.h>
int main() {
    int n, c = 0;
    printf("Enter a number: ");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
        if (n % i == 0) ++c;
    printf(c == 2 ? "The number is a PRIME NUMBER" : "The number is a COMPOSITE NUMBER");
    return 0;
}
