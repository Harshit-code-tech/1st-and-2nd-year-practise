// c program to swap the pair of elements starting from beginning by passing the array as function argument.
#include <stdio.h>
void swap(int *x, int *y)
{
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
}
int main()
{
    int n, i, j;
    printf("Enter the size of the array : ");
    scanf("%d", &n);
    int a[n];
    printf("Enter the elements of the array : ");
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);
    printf("The elements of the array are : ");
    for (i = 0; i < n; i++)
        printf("%d ", a[i]);
    printf("\n");
    for (i = 0; i < n; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (a[i] > a[j])
                swap(&a[i], &a[j]);
        }
    }
    printf("The elements of the array after swap are : ");
    for (i = 0; i < n; i++)
        printf("%d ", a[i]);
    return 0;
}