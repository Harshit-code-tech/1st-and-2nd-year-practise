#include <stdio.h>

int main()
{

    float f,c;
    int choice;

    printf("\n1: Convert temperature from Fahrenheit to Celsius.\n");
    printf("\n2: Convert temperature from Celsius to Fahrenheit.\n");
    printf("\nEnter your choice (1, 2): ");
    scanf("%d",&choice);

    if(choice ==1){
        printf("\nEnter temperature in Fahrenheit: ");
        scanf("%f",&f);
        c= (f - 32) / 1.8;
        printf("\nTemperature in Celsius: %.2f",c);
    }
    else if(choice==2){
        printf("\nEnter temperature in Celsius: ");
        scanf("%f",&c);
        f= (c*1.8)+32;
        printf("\nTemperature in Fahrenheit: %.2f",f);
    }
    else{
        printf("\n Wrong input please try again");
    }
    return 0;
}