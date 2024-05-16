#include <stdio.h>

int main()  
{  
    int n, exp, exp1;  
    long long value = 1;   
    printf("Enter the base and exponent:\n\n");  
    scanf("%d%d", &n, &exp);   
    exp1 = exp;   // storing original value for future use  
    while (exp-- > 0)  
    {  
        value *= n; // multiply n to itself exp times  
    }  
    printf("\n%d^%d = %lld\n\n", n, exp1, value);  
    return 0;  
}
