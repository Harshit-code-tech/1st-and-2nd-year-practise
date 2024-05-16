#include<stdio.h>
#include<string.h>
#define pi 3.141
int main()  {  
    char pass[50];
    pass:
    printf("Enter your password: ");
    scanf("%s",&pass);
    if(strcmp(pass,"abcd1234")==0)
    {printf("login\n");
    }
    else
    {printf("failed\n");
    goto pass;
    }
    float a, b;  
    printf("Enter radius of circle: \n");  
    scanf("%f",&a);  
    b = pi*a*a;  
    printf("area of circle : %0.3f\n",b);
    return 0;
}


