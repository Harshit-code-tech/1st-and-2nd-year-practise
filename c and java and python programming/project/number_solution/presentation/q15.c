/*
15) Trimorphic number : Given a number N, the task is to check whether the number is Trimorphic number or not. A number is called Trimorphic number if and only if its cube ends in the same digits as the number itself. In other words, number appears at the end of its cube.
*/
#include <stdio.h>
#include <math.h>
int main()
{
	//accepting a number from the user in n
	int n,c=0;	//c stores the number of digits in n
	printf("Enter a number\n");
	scanf("%d",&n);
	
	int cube=n*n*n;
	//printf("cube is %d\n",cube); -->comment out to konw the value of cube
	//using the digit extarction loop to count the number of digits in the given number n
	for(int i=n;i!=0;i/=10)
	{
		// c variable counts the number of digits of a given number
		c++;
	}
	//if the cube ends with the number then the number is caled trimorphic number
	//storing the last c digits of the cube in ld
	int ld=cube%(int)pow(10,c);
	//printf("last %d digit is %d\n",c,ld); -->comment out to see the value of ld
	/*
		for example if a number is n=35
		cube=42875 // cube of n
		c=2 i.e. number if digit in n=35
		ld=cube%pow(10,c)
		ld=cube%pow(10,2)
		ld=cube%10^2
		ld=42875%100
		ld=75
	*/
	if(ld==n)
	{
		printf("Trimorphic number\n");
	}
	else
	{
		printf("Not a trimorphic number\n");
	}
	return 0;
}

/*
Test values
0, 1, 4, 5, 6, 9, 24, 25, 49, 51, 75, 76, 99, 125, 249, 251, 375, 376, 499, 501, 624, 625, 749, 751, 875, 999, 1249
*/
