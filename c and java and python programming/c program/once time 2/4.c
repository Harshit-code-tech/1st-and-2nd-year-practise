// c program to calculate x^y by writing a function pointer (take x&y value in pointer)with argument without return
#include <stdio.h>

void power(int *x, int *y, void (*call)(int))
{
    int result = 1;
    for (int i = 0; i < *y; i++)
    {
        result *= *x;
    }
    call(result);
}

void final(int result)
{
    printf("x^y = %d\n", result);
}

int main()
{
    int x, y;

    printf("Enter the value of x: ");
    scanf("%d", &x);

    printf("Enter the value of y: ");
    scanf("%d", &y);

    power(&x, &y, final);

    return 0;
}
