// c program to find out ncr(combination)factor by using a user defined function for factorial
#include <stdio.h>

int factorial(int n);

int main()
{
    int n, r;
    float nCr;

    printf("Enter the value of n and r\n");
    scanf("%d%d", &n, &r);

    nCr = factorial(n) / (factorial(r) * factorial(n - r));

    printf("%dC%d = %.2f\n", n, r, nCr);

    return 0;
}

int factorial(int n)
{
    int i;
    int fact = 1;

    for (i = 1; i <= n; i++)
    {
        fact *= i;
    }

    return fact;
}