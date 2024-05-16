#include <stdio.h>
int main (){
    int num,x,y,z;
    printf("Enter the value of x,y,z\n");
    scanf("%d",&num);
    x=num/100;
    int t=num%100;
    y=t/10;
    z=num%10;
    printf("%d%d%d",x*x,y*y,z*z);
    return 0;
    
}