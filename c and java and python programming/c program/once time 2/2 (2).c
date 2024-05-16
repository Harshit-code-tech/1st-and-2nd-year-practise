// c program of finding mimum in aay
#include <stdio.h>

int M(int a[], int s)
{
    int m = a[0];

    for (int i = 1; i < s; i++)
    {
        if (a[i] > m)
        {
            m = a[i];
        }
    }

    return m;
}

int main()
{
    int s;

    printf("Enter the size of the array: ");
    scanf("%d", &s);

    int a[s];

    printf("Enter the elements of the array:\n");
    for (int i = 0; i < s; i++)
    {
        printf("Element %d: ", i + 1);
        scanf("%d", &a[i]);
    }

    int m = M(a, s);
    printf("The maximum element in the array is: %d\n", m);

    return 0;
}
