/*
19) Abundant Numbers: Abundant numbers are numbers whose sum of proper divisors (excluding the number itself) is greater than the number itself. For example, 12 is an abundant number because its proper divisors (excluding 12) are 1, 2, 3, 4, and 6, and 1 + 2 + 3 + 4 + 6 = 16, which is greater than 12.
*/
#include <stdio.h>
#include <math.h>
int main()
{
	//accepting a number from the user
	int n,s=0;		//s stores the sum of the factors
	printf("Enter a number\n");
	scanf("%d",&n);
	
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			s=s+i;
		}
	}
	if(s>n&&n>-1)
	{
		printf("Abundant Number\n");
	}
	else
	{
		printf("Not an Abundant Number\n");
	}
	return 0;
}

/* test values
2, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66, 70, 72, 78, 80, 84, 88, 90, 96, 100, 102, 104, 108, 112, 114, 120
*/
