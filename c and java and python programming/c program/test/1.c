// C program to find Sum of series S=1+(1+2)+(1+2+3)+..….+(1+2+3+…+n)

#include <stdio.h>

int main()
{
    int n, sum, n1 = 0, i, j;

    printf("\nEnter value for n = ");
    scanf("%d", &n);

    for (i = 1; i <= n; i++)
    {
        sum = 0;
        for (j = 1; j <= i; j++)
        {
            sum = sum + j;
        }
        n1 = n1 + sum;
    }

    printf("\nThe Sum =[ %d ]\n",n1);

    return 0;
}