// c program to find out gcd using recursion
#include <stdio.h>
int gcd(int a, int b)
{
    if (b == 0)
        return a;
    else
        return gcd(b, a % b);
}
int main()
{
    int n, m;
    printf("Enter the value of n : ");
    scanf("%d", &n);
    printf("Enter the value of m : ");
    scanf("%d", &m);
    int x = gcd(n, m);
    printf("The gcd of %d and %d is %d \n", n, m, x);
    return 0;
}
