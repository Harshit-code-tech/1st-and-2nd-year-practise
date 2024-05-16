//armstrong number
#include <stdio.h>
int main()
{
	int n,s=0;
	printf("Enter a number\n");
	scanf("%d",&n);
	
	for(int i=n;i!=0;i/=10)
	{
		int r=i%10;
		
		s=s+(r*r*r);
	}
	if(s==n)
	{
		printf("Armstrong number \n");
	}
	else
	{
		printf("Not a armstrong number\n");
	}
	return 0;
}
