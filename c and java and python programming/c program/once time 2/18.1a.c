#include <stdio.h>

int main() {
    int num, sum, temp;

    printf("Enter a 3-digit number: ");
    scanf("%d", &num);

    // separate digits and add them
    sum = num % 10;
    num = num / 10;
    sum += num % 10;
    num = num / 10;
    sum += num;

    printf("The sum of digits of %d is %d", num, sum);
    return 0;
}
