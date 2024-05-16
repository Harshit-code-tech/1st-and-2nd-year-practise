/*c program to generate all prime  numbers between 1 and n by using  a user defined 
function (say isprime) to be used for prime number testing,where n is a value supplied in 
the user.*/
#include<stdio.h>
void main(){
   int i, num, n, count;
   printf("Enter the range: ");
   scanf("%d", &n);
   printf("The prime numbers in between the range 1 to %d:",n);
   for(num = 1;num<=n;num++){
      count = 0;
      for(i=2;i<=num/2;i++){
         if(num%i==0){
            count++;
         break;
      }
   }
   if(count==0 && num!= 1)
      printf("%d ",num);
   }
   return 0;
}