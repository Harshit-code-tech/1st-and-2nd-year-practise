//no rt/no arg
#include <stdio.h>

void check() {
    int n;
    printf("Enter an integer: ");
    scanf("%d", &n);
    if (n % 2 == 0) {
        printf("%d is even.\n", n);
    } else {
        printf("%d is odd.\n", n);
    }
}

int main() {
    check();
    return 0;
}
