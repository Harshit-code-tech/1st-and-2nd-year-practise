//strong number 
#include <stdio.h>
int main()
{
	int n,s=0;
	printf("Enter a number\n");
	scanf("%d",&n);
	
	for(int i=n;i!=0;i/=10)
	{
		int r=i%10;
		int f=1;
		for(int j=1;j<=r;j++)
		{
			f=f*j;
		}
		s=s+f;
	}
	if(s==n)
	{
		printf("Strong number \n");
	}
	else
	{
		printf("Not a strong number\n");
	}
	return 0;
}
