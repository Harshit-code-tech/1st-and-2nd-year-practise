#include <stdio.h>

int main() {
    
    int m;
    printf("Enter the number of rows: ");
    scanf("%d", &m);
    
    // Print upper part of the pattern
    for (int i = 1; i <= m; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            printf("%d", m - j + 1);
        }
        for (int j = i+1; j <= m; j++)
        {
            printf("%d", m - i + 1);
        }

        //mirror
        for (int j = i; j >= 1; j--)
        {
            printf("%d", m - j + 1);
        }
        for (int j = i+1; j <= m; j++)
        {
            printf("%d", m - i + 1);
        }
        printf("\n");
    }

    // Print lower part of the pattern
    for (int i = m-1; i >= 1; i--)
    {
        for (int j = 1; j <= i; j++)
        {
            printf("%d", m - j + 1);
        }
        for (int j = i+1; j <= m; j++)
        {
            printf("%d", m - i + 1);
        }
        printf("\n");
    }

    return 0;
}

