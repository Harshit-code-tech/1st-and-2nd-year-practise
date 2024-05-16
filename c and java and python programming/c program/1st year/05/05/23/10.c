//no rt/ with arg
#include <stdio.h>

void check(int n) {
    if (n % 2 == 0) {
        printf("\n%d is even.\n", n);
    } else {
        printf("\n%d is odd.\n", n);
    }
}

int main() {
    int x;
    printf("Enter an integer: \n");
    scanf("%d", &x);
    check(x);
    return 0;
}
