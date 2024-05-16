//c program to find the big numebr between two numbers using pointer function
#include <stdio.h>

int* Big(int *a, int *b)
{
    if (*a > *b) {
        return a;
    } else {
        return b;
    }
}

int main()
{
    int num1, num2;
    printf("Enter the first number: ");
    scanf("%d", &num1);

    printf("Enter the second number: ");
    scanf("%d", &num2);

    int *result = Big(&num1, &num2);

    printf("The bigger number is: %d\n", *result);

    return 0;
}
