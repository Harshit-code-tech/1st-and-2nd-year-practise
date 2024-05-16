#include <stdio.h>
#define c 15
int main()
{
    char s1[c], s2[c], i;
    printf("Enter 1st string : \n");
    fgets(s1, c, stdin);
    for (i = 0; s1[i] != '\0'; ++i)
    {
        s2[i] = s1[i];
    }
    s2[i] = '\0';
    printf("Entered value is : %s, which is now stored in 2nd string", s2);
    return 0;
}