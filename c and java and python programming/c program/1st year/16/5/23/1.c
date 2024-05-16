//write a program to swap two numbers using pointers
#include<stdio.h>
int main(){
    int a,b,*x,*y,temp;
    printf("eNTER 2 NUMBERS ");
    scanf("%d%d",&a,&b);
    x=&a;
    y=&b;
    temp=*x;
    *x=*y;
    *y=temp;
    printf("a=%d,b=%d",a,b);
    return 0;
    
}

