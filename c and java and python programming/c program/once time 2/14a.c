#include<stdio.h>
#define pi 3.141
int main(){
    float r,a;
    printf("enter the value of  r:\n");
    scanf("%f",&r);
    a=pi*r*r;
    printf("The area of given radius of circle  is : %f",a);
    return 0;
}