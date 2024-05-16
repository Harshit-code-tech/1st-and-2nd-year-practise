#include <stdio.h>
int main()
{
    int arr[2][7];
    int i, j;
    for (i = 0; i < 2; i++)
    {
        for (j = 0; j < 7; j++)
        {
            printf("Enter the temperature of %d city at %d day:\n", i, j);
            scanf("%d", &arr[i][j]);
        }
    }
    for (i = 0; i < 2; i++)
    {
        for (j = 0; j < 7; j++)
        {
            printf("\nThe temperature of %d city at %d day is %d\n", i, j, arr[i][j]);
        }
    }
    return 0;
}