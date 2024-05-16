#include <stdio.h>

int main() {
    int num, i = 1, fact = 1;
    printf("Enter a number: ");
    scanf("%d", &num);
    while (fact < num) {
        fact *= ++i;
    }
    printf("%d is%s a factorial", num, fact == num ? "" : "not");
    if (fact == num) {
        printf(" of %d", i);
    }
    return 0;
}
