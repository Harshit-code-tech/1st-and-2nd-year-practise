// c program to swap the values of two variables by using suitable user defined function for it
#include <stdio.h>

void swap(int *x, int *y);

int main()
{
    int a, b;

    printf("Enter the value of a and b\n");
    scanf("%d%d", &a, &b);

    printf("Before Swapping\na = %d\nb = %d\n", a, b);

    swap(&a, &b);

    printf("After Swapping\na = %d\nb = %d\n", a, b);

    return 0;
}

void swap(int *x, int *y)
{
    int temp;

    temp = *x;
    *x = *y;
    *y = temp;
}
