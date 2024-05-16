/*
14)palindrome number : A palindromic number (also known as a numeral palindrome or a numeric palindrome) is a number (such as 16461) that remains the same when its digits are reversed.]
*/
#include <stdio.h>
int main()
{
	//accepting a number from the user in n
	int n,r=0;	//r stores the reverse of the number
	printf("Enter a number\n");
	scanf("%d",&n);
	
	//using digit extraction loop
	//this loop is used to reverse any given number
	for(int i=n;i!=0;i/=10)
	{
		r=r*10+i%10;
	}
	//printf("r is %d\n",r); -> comment out to see the reversed value of n which is stored in r
	// checking if the reversed number r is equal to the entered number n
	if(r==n)
	{
		printf("Palindrome number \n");
	}
	else
	{
		printf("Not a Palindrome number \n");
	}
	return 0;
}

/* Test values
121,34343,232,2332,2334332,57899875....etc
*/
