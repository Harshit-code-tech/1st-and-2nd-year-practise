/*
A disarium number is a number in which the sum of the digits to the power of their respective position is equal to the number itself (position is counted from left to right starting from 
	
	Example of a Disarium number is 175, 1¹ + 7² + 5³ = 1 + 49 + 125= 175. Hence,175 is a disarium number.
*/
#include <stdio.h>
#include <math.h>
int main()
{
	//accepting a number from the user in n
	int n,c=0,s=0;	//variable s stores the sum of the digits to the power of their respective position
	printf("Enter a number\n");
	scanf("%d",&n);
	
	for(int i=n;i!=0;i/=10)
	{
		// c variable counts the number of digits of the given number
		c++;
	}
	//calculating sum
	for(int i=n;i!=0;i/=10)
	{
		//i%10 gives the last digit
		s=s+pow(i%10,c--);	//c tells the position of the number from last
	}
	if(s==n)
	{
		printf("Disarium number\n");
	}
	else
	{
		printf("Noat a Disarium number\n");
	}
	return 0;
}

/* Test values
89, 135, 175, 518
*/
