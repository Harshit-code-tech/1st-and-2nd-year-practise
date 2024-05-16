#include <stdio.h>
#define c 100
#define d 100
int main()
{
    int m, n, p, q, i, j, k, sum = 0, search, flag = 0, e;
    int a[c][d], b[c][d], res[c][d], trans[c][d], asc[c][d], dec[c][d], C[c][d];

    printf("Enter the order of first matrix(max = 100):\n");
    scanf("%d%d", &m, &n);
    printf("Enter the order of second matrix(max = 100): \n");
    scanf("%d%d", &p, &q);
    // for multiplication
    if (n != p)
    {
        printf("Matrix is incompatible for multiplication\n");
    }
    else
    {
        printf("Enter the elements of Matrix-A:\n");
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                scanf("%d", &a[i][j]);
            }
        }

        printf("Enter the elements of Matrix-B:\n");
        for (i = 0; i < p; i++)
        {
            for (j = 0; j < q; j++)
            {
                scanf("%d", &b[i][j]);
            }
        }
        // multiplying
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < q; j++)
            {
                res[i][j] = 0;
                for (k = 0; k < p; k++)
                {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        printf("The product of the two matrices is:-\n");

        for (i = 0; i < m; i++)
        {
            for (j = 0; j < q; j++)
            {
                printf("%d\t", res[i][j]);
            }
            printf("\n");
        }
    }
    // computing the transpose
    for (int i = 0; i < m; ++i)
        for (int j = 0; j < q; ++j)
        {
            trans[j][i] = res[i][j];
        }

    // printing the transpose
    printf("\nTranspose of the matrix:\n");
    for (int i = 0; i < m; ++i)
        for (int j = 0; j < q; ++j)
        {
            printf("%d  ", trans[i][j]);
            if (j == q - 1)
                printf("\n");
        }

    // Check if matrices can be added
    if (m != p || n != q || m != n || p != q)
    {
        printf("Matrices cannot be added as they are not square matrices\n");
    }

    // Matrix Addition
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < n; j++)
        {
            C[i][j] = a[i][j] + b[i][j];
        }
    }

    // Display Matrix C
    printf("\nMatrix C = A + B:\n");
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("%d ", C[i][j]);
        }
        printf("\n");
    }
    // sum of each row of the matrix
    for (i = 0; i < m; i++)
    {
        sum = 0;
        for (j = 0; j < q; j++)
        {
            sum += trans[i][j];
        }
        printf("\nThe sum of the matrix of row %d is %d\n", i, sum);
    }
    // Initializing min with the first element of the matrix
    int min = trans[0][0];

    // Finding minimum element in the matrix
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < q; j++)
        {
            if (trans[i][j] < min)
            {
                min = trans[i][j];
            }
        }
    }

    // Displaying the minimum element
    printf("\nThe smallest element in the matrix is %d\n", min);
    // Finding mmaximum element in the matrix
    int max = trans[0][0];
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < q; j++)
        {
            if (trans[i][j] > max)
            {
                max = trans[i][j];
            }
        }
    }
    // Displaying the maximum element
    printf("\nThe largest element in the matrix is %d\n", max);
    // sum of diagonal
    for (i = 0; i < m; i++)
    {
        sum += trans[i][i];
    }

    printf("\nThe sum of the diagonal elements of the matrix is: %d\n", sum);

    // Print diagonal elements
    printf("\nDiagonal elements of matrix: \n");
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < q; j++)
        {
            if (i == j)
            {
                printf("%d ", trans[i][j]);
            }
        }
    }

    // search for element
    printf("\nWhich element you want to search: \n");
    scanf("%d", &search);
    
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < q; j++)
        {
            if (trans[i][j] == search)
            {
                printf("\nThe element is found at (%d,%d)position\n", i, j);
                flag = 1;
                break;
            }
            if (flag == 1)
                ;
            break;
        }
        if (flag == 0)
            printf("\nNot found\n");

        
    }
    // sort of matrix
    printf("\nAfter arranging rows in ascending order:\n");
    for (i = 0; i < m; ++i)
    {
        for (j = 0; j < q; ++j)
        {
            for (k = (j + 1); k < q; ++k)
            {
                if (trans[i][j] > trans[i][k])
                {
                    int temp = trans[i][j];
                    trans[i][j] = trans[i][k];
                    trans[i][k] = temp;
                }
            }
            printf("%d\t", trans[i][j]); // Print the arranged value
        }
        printf("\n");
    }

    printf("\nAfter arranging the columns in descending order \n");
    for (j = 0; j < q; ++j)
    {
        for (i = 0; i < m; ++i)
        {
            for (k = i + 1; k < m; ++k)
            {
                if (trans[i][j] < trans[k][j])
                {
                    int temp = trans[i][j]; // Store trans[i][j] in temporary variable
                    trans[i][j] = trans[k][j];
                    trans[k][j] = temp; // Swap values in trans[i][j] and trans[k][j]
                }
            }
        }
    }

    for (i = 0; i < m; ++i)
    {
        for (j = 0; j < q; ++j)
        {
            printf(" %d", trans[i][j]);
        }
        printf("\n");
    }

    return 0;
}
