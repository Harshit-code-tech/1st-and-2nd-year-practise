//with rt/ no arg
#include <stdio.h>

int add() {
    int a, b, sum;
    printf("Enter two numbers: \n");
    scanf("%d%d", &a, &b);
    sum = a + b;
    return sum;
}

int main() {
    int result;
    result = add();
    printf("\nSum = %d\n", result);
    return 0;
}

