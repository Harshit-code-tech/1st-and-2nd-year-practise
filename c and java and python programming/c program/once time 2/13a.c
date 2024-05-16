#include<stdio.h>
#define pi 3.141
int main(){
    float r,c;
    printf("enter the value of  r:\n");
    scanf("%f",&r);
    c=4*pi*r;
    printf("The circumference of given radius of circle  is : %f",c);
    return 0;
}