#include <stdio.h>
int main()
{
    /* Declare variables*/
    int i, j, n;

    printf("Enter the number:\n");
    scanf("%d", &n);
    /* Run loops*/
    for (i = 1; i <= n * 2 - 1; i++)
    {
        for (j = 1; j <= n * 2 - 1; j++)
        {
            /* Conditions for print stars*/
            if (i == n || j == n || i == 1 && j > n || i < n && j == 1 || i > n && j == n * 2 - 1 || i == n * 2 - 1 && j < n)
            {
                printf(" *");
            }
            
            else
            {
                printf("  ");
            }
        }
        printf("\n");
    }
}