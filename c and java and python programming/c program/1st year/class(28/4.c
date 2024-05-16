// c program to print the number of vowels and consonent present in user input sentence using string
#include <stdio.h>
#include <string.h>
#define C 15

int main()
{
    char s[C];
    int i, v = 0, c = 0;

    printf("Enter  the string : ");
    gets(s);

    for (i = 0; s[i]; i++)
    {
        

            if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U')
                v++;
            else ;
                c++;
        
    }

    printf("vowels = %d\n", v);
    printf("consonants = %d\n", c);

    return 0;
}