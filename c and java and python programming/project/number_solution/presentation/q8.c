//composite number
#include <stdio.h>
int main()
{
	int n,c=0;
	printf("Enter a number\n");
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			c++;
		}
	}
	//for a number to be composite the factors will not be equal to 2
	if(c!=2)
	{
		printf("Composite number\n");
	}
	else
	{
		printf("Not a composite number\n");
	}
	return 0;
}
