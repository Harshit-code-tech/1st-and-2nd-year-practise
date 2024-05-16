//harshad number
#include <stdio.h>
int main()
{
	int n,s=0;
	printf("Enter a number\n");
	scanf("%d",&n);
	
	for(int i=n;i!=0;i/=10)
	{
		int r=i%10;
		
		s=s+r;
		
	}
	printf("\n%d\n",s);		// comment out to check the sum.
	if(n%s==0)
	{
		printf("Harshad number \n");
	}
	else
	{
		printf("Not a harshad number\n");
	}
	return 0;
}
