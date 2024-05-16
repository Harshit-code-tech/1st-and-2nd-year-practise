#include<stdio.h>
int main(){
    float b,h,a;
    printf("enter the value of  b,h:\n");
    scanf("%f%f",&b,&h);
    a=0.5*b*h;
    printf("The area of right angle triangle is : %f",a);
    return 0;
}