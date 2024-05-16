#include<stdio.h>
int gcd(int i, int j)
{
   if(j>i)
      return gcd(j,i);
   if(j==0)
      return i;
   else
      return gcd(j,i%j);
}
int main(){
   int a,b;
   printf("Enter the two integers: ");
   scanf("%d%d",&a,&b);
   printf("HCF of %d and %d is %d",a,b,gcd(a,b));
   return 0;
}

