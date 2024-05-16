#include<stdio.h>
int main(){
    float a,a1,b1,b2,p;
    printf("enter the value of  a,a1,b1,b2:\n");
    scanf("%f%f%f%f",&a,&a1,&b1,&b2);
    p=a+a1+b1+b2;
    printf("The parameter of trapezium is : %.3f",p);
    return 0;
}