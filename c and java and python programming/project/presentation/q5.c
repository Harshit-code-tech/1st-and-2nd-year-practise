/*
5) Autmorphric no. : An automorphic number is an integer whose square ends with the given integer, as (25)2 = 625, and (76)2 = 5776.
*/
#include <stdio.h>
#include <math.h>
int main()
{
	//accepting a number from the user in n
	int n,c=0;	//c stores the number of digits in n
	printf("Enter a number\n");
	scanf("%d",&n);
	
	int sq=n*n;
	//printf("square is %d\n",sq); -->comment out to konw the value of square
	//using the digit extarction loop to count the number of digits in the given number n
	for(int i=n;i!=0;i/=10)
	{
		// c variable counts the number of digits of a given number
		c++;
	}
	//if the square ends with the number then the number is caled automorphic number
	//storing the last c digits of the square in ld
	int ld=sq%(int)pow(10,c);
	//printf("last %d digit is %d\n",sq,ld); -->comment out to see the value of ld
	/*
		for example if a number is n=25
		sq=625 // cube of n
		c=2 i.e. number if digit in n=25
		ld=sq%pow(10,c)
		ld=sq%pow(10,2)
		ld=sq%10^2
		ld=625%100
		ld=25
	*/
	if(ld==n)
	{
		printf("Automorphic number\n");
	}
	else
	{
		printf("Not a automorphic number\n");
	}
	return 0;
}

/*
Test values
0, 1, 5, 6, 25, 76, 376, 625, 9376
*/
