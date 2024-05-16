#include<stdio.h>  
  
int fact(int n)  
{  
  if (n == 0)  
    return 1;  
  else  
    return(n * fact(n-1));  
}  
   
int main()  
{  
  int number ;  
  printf("Enter a number: ");  
  scanf("%d", &number);   
   
  
  printf("Factorial of %d is %d\n", number, fact(number));  
  return 0;  
}  