//with rt/ no arg
#include <stdio.h>

int check() {
    int n;
    printf("Enter an integer: \n");
    scanf("%d", &n);
    if (n % 2 == 0) {
        return 1;
    } else {
        return 0;
    }
}

int main() {
    int result;
    result = check();
    if (result == 1) {
        printf("\nThe number is even.\n");
    } else {
        printf("\nThe number is odd.\n");
    }
    return 0;
}
