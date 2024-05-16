//buzz number - either divisible by 7 or ends with 7
#include <stdio.h>
int main()
{
	int n,s=0;
	printf("Enter a number\n");
	scanf("%d",&n);
	
	if(n%7==0||n%10==7)
	{
		printf("Entered number is buzz number\n");
	}
	else
	{
		printf("Entered number is not a buzz number\n");
	}
	return 0;
}
