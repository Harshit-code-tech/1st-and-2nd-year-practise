#include <stdio.h>
int main() {
    int num, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &num);
    for(int i = 1; i < num; ++i)
        if(num % i == 0) sum += i;
    printf("%d is %sa perfect number\n", num, num == sum ? "" : "not ");
    return 0;
}
