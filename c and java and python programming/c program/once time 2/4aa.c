#include<stdio.h>   
#define pi 3.141
int main()   
{  
    float a, b;  
    printf("Enter radius of circle: \n");  
    scanf("%f",&a);  
    b = pi*a*a;  
    printf("area of circle : %0.3f\n",b);    
    return 0;  
}   