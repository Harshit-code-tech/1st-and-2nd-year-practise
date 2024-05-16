//perfect number 
#include <stdio.h>
int main()
{
	int n,s=0;
	printf("Enter a number\n");
	scanf("%d",&n);
	
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			s=s+i;
		}
	}
	if(n==s)
	{
		printf("Entered number is a perfect number\n");
	}
	else
	{
		printf("Entered number is not a perfect number \n");
	}
	return 0;
}
