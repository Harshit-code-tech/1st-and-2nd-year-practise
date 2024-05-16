//magic number

/*
9) Magic no. : if we get the product of the sum of digits of a number and its reverse as the number then the number is called magic number 
1729 is a magic number.
Since, 1+7+2+9=19 and 19*91=1729.
*/

#include <stdio.h>
int main()
{
	int n;
	printf("Enter a number\n");
	scanf("%d",&n);
	
	//storing the sum of the digits in s
	int s=0;
	// using digit extration loop
	for(int i=n;i!=0;i=i/10)
	{
		int r=i%10;
		s=s+r;
	
	}
	//storing the reverse of the sum in sr
	int sr=0;
	// using digit extration loop
	for(int i=s;i!=0;i=i/10)
	{
		int r=i%10;
		sr=sr*10+r;
	}
	//if the product of the sum and the reverse of the sum is equal to the number then the number is magic number by the given defination.
	if(n==(s*sr))
	{
		printf("Magic number\n");
	}
	else
	{
		printf("Not a magic number\n");
	}
	return 0;
}
	
