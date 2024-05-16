#include <stdio.h>
int main() {
    int a, b=0, c=1; 
    printf("Enter number: ");
    scanf(" %d",&a); 
    while(a!=0)
    {
        b += (a%10)*(a%10)*c;        
        c*=(a%10<=3)?10:100;    
        a/=10;
    }   
    printf("\n: %d",b);
    return 0;
}