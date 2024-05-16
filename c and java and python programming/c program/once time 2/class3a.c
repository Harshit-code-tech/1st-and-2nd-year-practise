#include <stdio.h>

int main()
{
    int n;
    printf ("Enter the order of matrices : ");
    scanf ("%d",&n);

    int first[n][n], second[n][n], sum[n][n];

    printf ("Enter the elements of first matrix : \n");
    for (int i = 0; i < n; ++i){
        for (int j = 0; j < n; ++j){
            scanf ("%d", &first[i][j]);
        }
    }

    printf ("\nEnter the elements of second matrix : \n");
    for (int i = 0; i < n; ++i){
        for (int j = 0; j < n; ++j){
            scanf ("%d",&second[i][j]);
        }
    }

    // Adding matrices
    for (int i = 0; i < n; ++i){
        for (int j = 0; j < n; ++j){
            sum[i][j] = first[i][j] + second[i][j];
        }
    }

    // Displaying the result
    printf ("\nResultant matrix is : \n");
    for (int i = 0; i < n; ++i){
        for (int j = 0; j < n; ++j){
            printf ("%d ", sum[i][j]);
        }
        printf ("\n");
    }
    return 0;
}
