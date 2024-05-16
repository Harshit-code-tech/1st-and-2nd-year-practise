#include <stdio.h>
#define N 3
#define M 2
int main()
{
    int arr[N][M];
    int i, j;
    printf("Enter student marks as per subject: \n");
    for (i = 0; i < N; i++)
    {
        for (j = 0; j < M; j++)
        {

            scanf("%d", &arr[i][j]);
        }
    }
    for (i = 0; i < N; i++)
    {
        for (j = 0; j < M; j++)
        {

            printf("\nStudent No.%d, Marks of subject %d is %d\n", i, j, arr[i][j]);
        }
    }
    return 0;
}