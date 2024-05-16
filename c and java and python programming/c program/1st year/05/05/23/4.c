//with rt/ with arg
#include <stdio.h>

int add(int a, int b) {
    int sum;
    sum = a + b;
    return sum;
}

int main() {
    int x, y, result;
    printf("Enter two numbers: \n");
    scanf("%d%d", &x, &y);
    result = add(x, y);
    printf("\nSum = %d\n", result);
    return 0;
}
