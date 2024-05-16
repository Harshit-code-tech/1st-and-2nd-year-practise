/*
16) spy number : a number where the sum of the digits is equal to the product of the digits
Example : 
		1124
		1+1+2+4 = 8
		1*1*2*4 = 8
		other example 132,231,312
*/
#include <stdio.h>
#include <math.h>
int main()
{
	//accepting a number from the user in n
	int n,s=0,p=1;	//s stores the sum of digits and p stores the product of digits
	printf("Enter a number\n");
	scanf("%d",&n);
		
	for(int i=n;i!=0;i/=10)
	{
		s=s+i%10;
		p=p*i%10;
	}
	//printf("Sum is %d\n",s);	//comment out to see the sum of the digits
	//printf("Product is %d\n",p);	//comment out to see the product of the digits
	if(s==p)
	{
		printf("Spy number \n");
	}
	else
	{
		printf("Not a spy number \n");
	}
	return 0;
}
