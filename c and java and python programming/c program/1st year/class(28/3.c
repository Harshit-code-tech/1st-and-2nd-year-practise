#include <stdio.h>
#define c 15
int main()
{

    char str[c];
    int i = 0, l = 0;

    printf("Enter a string: \n");
    scanf("%s", str);

    for (i = 0; str[i] != '\0'; i++)
    {
        l++;
    }

    printf("\nLength of input string: %d", l);

    return 0;
}