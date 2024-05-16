#include<stdio.h>  
int main()    
{    
    int n,r,sum=0,temp;    
    printf("enter the number=");    
    scanf("%d",&n);    
    temp=n;    
    while(n>0) {    
        r=n%10;    
        sum+=r*r*r;    
        n=n/10;    
    }    
    printf(temp==sum ? "armstrong number" : "not armstrong number");    
    return 0;  
} 
