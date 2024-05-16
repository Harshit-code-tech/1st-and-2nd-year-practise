/*
20)Kaprekar Numbers: Kaprekar numbers are numbers whose square can be split into two parts that add up to the original number. For example, 45 is a Kaprekar number because 45^2 = 2025, and 20 + 25 = 45. Kaprekar numbers have applications in number theory and cryptography.
*/
#include <stdio.h>
#include <math.h>
int main()
{
	//accepting a number from the user in n
	int n,c=0,k=0;
	printf("Enter a number\n");
	scanf("%d",&n);
	
	int sq=n*n;
	
	//printf("square is %d\n",sq); -->comment out to konw the value of square of n
	//using the digit extarction loop to count the number of digits in the given number n
	for(int i=sq;i!=0;i/=10)
	{
		// c variable counts the number of digits in the square of the given number
		c++;
	}
	
	for(int i=1;i<=c;i++)
	{	
		//splits to all possible combination and checks if the sum of the bifurcated parts are equal to the number
		if((sq%(int)pow(10,i))+(sq/(int)pow(10,i))==n)
		{
			k=1;	//k is a flag variable which chages to 1 when kapikar number is found
			break;
		}
	}
	if(k==1&&n>0)
	{
		printf("Kaprekar number\n");
	}
	else
	{
		printf("Not a kaprekar number\n");
	}
	return 0;
}

/*
Test values
1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4879, 4950, 5050, 5292, 7272, 7777, 9999
*/
