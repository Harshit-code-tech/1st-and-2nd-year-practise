
//no rt/no arg
#include <stdio.h>

void add() {
    int a, b, sum;
    printf("Enter two numbers: \n");
    scanf("%d%d", &a, &b);
    sum = a + b;
    printf("\nSum = %d\n", sum);
}

int main() {
    add();
    return 0;
}
