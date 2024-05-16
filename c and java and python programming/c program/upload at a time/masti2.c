#include <stdio.h>
int main()
{
    int numbers[7] = {0.0F},sum=0.0F,count=7;
    while(count --> 0)
    {
        printf("Enter a number of %d place: ", 7-count);
        scanf("%d",numbers+count);
        sum += numbers[count];
    }
    printf("The sum is %d\n ;)\n", sum);    
    return 0;
}