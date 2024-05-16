#include < stdio.h >  
  
int main()  
{  
    float bs, hra, da, gs;  
  
    printf("Enter basic salary\n");  
    scanf("%f", &bs);  
  
    hra = bs * (20/100);  
    da  = bs * (40/100);  
  
    gs  = bs + hra + da;  
  
    printf("Gross Salary = %f\n", gs);  
  
    return 0;  
}