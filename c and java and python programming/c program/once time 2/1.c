#include <stdio.h>

int main()
{
    int a, b, *p, *q, sum;
    p=&a;
    q=&b;

    printf("Input two integers to add\n");
    scanf("%d%d", p, q);

    sum = add(p, q);

    printf("(%d) + (%d) = (%d)\n", a, b, sum);

    return 0;
}

int add(int *x, int *y)
{
    int sum=0;

    sum = *x + *y;

    return sum;
}