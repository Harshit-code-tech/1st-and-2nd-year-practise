#include<stdio.h>
int main()
{
 int i=0,n;
 float sum=0,num;
 printf("How many numbers you want to find sum :\n");
 scanf("%d",&n);
 printf("Enter the number\\s: \n");
 do{
  scanf("%f", &num);
  sum+=num;
  i++;
 }
 while (i<n);
 printf("Sum=%.3f", sum);
 return 0;
 
}