#include <stdio.h>

int main() {
    int num1, num2, num3, sum;

    printf("Enter three numbers: ");
    scanf("%d %d %d", &num1, &num2, &num3);

    // get the tenth position digit using modulus operator and add them
    sum = (num1 / 10) % 10;
    sum += (num2 / 10) % 10;
    sum += (num3 / 10) % 10;

    printf("The sum of tenth position digits is %d", sum);
    return 0;
}
