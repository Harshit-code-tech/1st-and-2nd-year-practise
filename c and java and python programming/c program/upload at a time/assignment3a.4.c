#include <stdio.h>

int main() {
    int n, sum = 0, f = 1,num;
    printf("Enter the number: \n");
    scanf("%d", &n);
    num=n;
    while (n--) {
        sum += f;
        f = sum - f;
    }
    printf("The sum of the first %d numbers in the Fibonacci sequence is %d.\n", num, sum);
    return 0;
}
