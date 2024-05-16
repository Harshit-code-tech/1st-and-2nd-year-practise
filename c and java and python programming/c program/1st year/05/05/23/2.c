//no rt/ with arg
#include <stdio.h>

void add(int a, int b) {
    int sum;
    sum = a + b;
    printf("\nSum = %d\n", sum);
}

int main() {
    int x, y;
    printf("Enter two numbers: \n");
    scanf("%d%d", &x, &y);
    add(x, y);
    return 0;
}
