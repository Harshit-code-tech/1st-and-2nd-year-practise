#include<stdio.h>
int main()
{
    float f,c;
    printf("\nEnter temperature in Fahrenheit: ");
    scanf("%f",&f);
    c= (f - 32) / 1.8;
    printf("\nTemperature in Celsius: %.2f",c);
}
