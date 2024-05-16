#include <stdio.h>

int main()
{
    int a;
    int *p;

    p = &a;
    printf("Enter a number: ");
    scanf("%d", p);

    printf("The value entered is: %d\n", *p);
    printf("The address of the variable is: %p\n", p);
    return 0;
}
