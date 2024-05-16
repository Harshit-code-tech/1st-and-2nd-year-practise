#include <stdio.h>  
int func(int n)  
{  
    static int counter=0; 
  if(n>0)  
  {  
      counter=counter+1;  
      return func(n/10);  
  }  
    else  
    return counter;  
}  
int main()  
{  
    int num,count=0;  
    printf("Enter a number");  
    scanf("%d",&num);  
   count=func(num);  
   printf("Number of digits is : %d", count);  
   return 0;  
}  
    