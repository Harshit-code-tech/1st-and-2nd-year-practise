/*
11.Happy no. : In number theory, a happy numer is a number which eventually reaches 1 when replaced by the sum of the square of each digit. For instance, 13 is a happy number because 1^2+3^2=10 and 1^2+0^2=1. On the other hand, 4 is not a happy number because the sequence starting with 4^2=16 and 1^2+6^2=37 eventually reaches 2^2+0^2=4, the number that started the sequence, and so the process continues in an infinite cyle without ever reaching 1. A number which is not happy is called sad or unappy.
*/

#include <stdio.h>
int main()
{
	//accepting a number from the user
	int n;
	printf("Enter a number\n");
	scanf("%d",&n);
	
	//if a number does not reaches 1 by the given logic it reaches to 4
	while(n!=4&&n!=1)
	{
		int s=0; 
		//s must be initialized inside the while loop as everytime it enters the while loop, the value of s must be set to 0 before storing the sum of the square of digits before each iteration
		
		//printf("n %d\n",n); <- comment out this statement to know the working of while loop
		
		//loop to extract digits of a numer 
		for(int i=n;i!=0;i/=10)
		{
			int r=i%10;	// stores the last digit of n
			s=s+r*r;	//stores the sum of the square of the digits 
		} 
		//printf("s %d\n",s); <- comment out this statement to know the value of s after each execution
		n=s;
	}
	if(n==1)
	{
		printf("happy number \n");
	}
	else
	{
		printf("sad or unhappy number\n");
	}
	return 0;
}
		
