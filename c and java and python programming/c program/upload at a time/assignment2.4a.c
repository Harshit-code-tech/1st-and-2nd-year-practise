#include <stdio.h>
int main() {
    int n, a, b, c, sum;
    printf("Enter 3-Digit Number: ");
    scanf("%d", &n);
    a = n / 100;
    b = n % 10;
    c = (n / 10) % 10;
    sum = a + b + c;
    printf("Sum is: %d", sum);
    return 0;
}
