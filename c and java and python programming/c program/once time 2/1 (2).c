// c program to multiply a matrix
#include <stdio.h>

int main()
{
    int m, n, p, q, i, j, k;
    int a[100][100], b[100][100], c[100][100];

    printf("Enter the number of rows and column for the first matrix: ");
    scanf("%d%d", &m, &n);

    printf("Enter the elements of the first matrix:\n");
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < n; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }

    printf("Enter the number of rows and column for the second matrix: ");
    scanf("%d%d", &p, &q);
    if (n != p)
    {
        printf("Error: The number of columns in the first matrix must be equal to the number of rows in the second matrix.\n");
        return 0;
    }

    printf("Enter the elements of the second matrix:\n");
    for (i = 0; i < p; i++)
    {
        for (j = 0; j < q; j++)
        {
            scanf("%d", &b[i][j]);
        }
    }

    for (i = 0; i < m; i++)
    {
        for (j = 0; j < q; j++)
        {
            c[i][j] = 0;
            for (k = 0; k < n; k++)
            {
                c[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    printf("The product of the matrices is:\n");
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < q; j++)
        {
            printf("%d ", c[i][j]);
        }
        printf("\n");
    }

    return 0;
}
