//c program to sort an array using pointers .
#include <stdio.h>
#include <stdlib.h>

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

void bsort(int *arr, int size)
{
    int i, j;
    for (i = 0; i < size - 1; i++)
    {
        for (j = 0; j < size - i - 1; j++)
        {
            if (*(arr + j) > *(arr + j + 1))
            {
                swap(arr + j, arr + j + 1);
            }
        }
    }
}

void prarr(int *arr, int size)
{
    int i;
    for (i = 0; i < size; i++)
    {
        printf("%d ", *(arr + i));
    }
    printf("\n");
}

int main()
{
    int *arr;
    int size, i;

    printf("Enter the size of the array: ");
    scanf("%d", &size);

    arr = (int *)malloc(size * sizeof(int));

    printf("Enter the elements of the array: ");
    for (i = 0; i < size; i++)
    {
        scanf("%d", arr + i);
    }

    printf("Original array: ");
    prarr(arr, size);

    bsort(arr, size);

    printf("Sorted array: ");
    prarr(arr, size);

    free(arr);

    return 0;
}
