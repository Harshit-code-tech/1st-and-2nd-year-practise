// c program to merge two string , stored it intp third array and display it
#include <stdio.h>

int main()
{
    char str1[100], str2[100], str3[200];
    int i, j;

    printf("Enter first string: ");
    scanf("%s", str1);

    printf("Enter second string: ");
    scanf("%s", str2);

    for (i = 0; str1[i] != '\0'; i++)
    {
        str3[i] = str1[i];
    }

    for (j = 0; str2[j] != '\0'; j++)
    {
        str3[i + j] = str2[j];
    }

    str3[i + j] = '\0';

    printf("Concatenated string: %s\n", str3);

    return 0;
}
