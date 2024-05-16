//factorial of numeber using recursive function
#include<stdio.h>
int fun(int n)
{
    if(n==1)
    return 1;
    else
    return n*fun(n-1);
}
int main(){
    int n;
    printf("ENter:\n");
    scanf("%d",&n);
    printf("\n%d is %d",n,fun(n));
    return 0;
}