/*
13) Ramanujan number : 1729, the Hardy-Ramanujan Number, is the smallest number which can be expressed as the sum of two different cubes in two different ways. 1729 is the sum of the cubes of 10 and 9 - cube of 10 is 1000 and cube of 9 is 729; adding the two numbers results in 1729.
*/
#include <stdio.h>
int main()
{
	//accepting a number from the user in n
	int n,w;
	printf("Enter a number\n");
	scanf("%d",&n);
	//the sum of i of i^3 and j^3 must never exceed the number in any case
	for(int i=1;(i*i*i)<=n;i++)
	{
		for(int j=i+1;(j*j*j)<=n;j++)
		{
			if((i*i*i)+(j*j*j)==n)//checks if the sum of cube of i and j is equal to the number
			{
				printf("%d^3 + %d^3 = %d\n",i,j,n); //->comment out to see the combinations
				w++;	//according to the defination the number of ways (w) must be 2
			}
		}
	}
	if(w==2)
	{
		printf("Hardy-Ramanujan Number\n");
	}
	else
	{
		printf("Not a Hardy-Ramanujan Number\n");
	}
	return 0;
}

/* Test values

1729, 4104, 13832, 20683, 32832, 39312, 40033, 46683, 64232, 65728, 110656, 110808, 134379, 149389, 165464, 171288, 195841, 216027, 216125, 262656, 314496, 320264, 327763

*/
