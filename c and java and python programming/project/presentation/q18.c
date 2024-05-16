/*
18)Twisted number : A number is called a twisted prime number if it is a prime number and the reverse of it is also a prime number 
example : 13 is a prime number 
	  reverse of 13 i.e. 31 is also a prime number 
*/
#include <stdio.h>
#include <math.h>
int main()
{
	//accepting a number from the user
	int n,p=1,c=0;
	printf("Enter a number\n");
	scanf("%d",&n);
	
	// checking if the entered number is a prime number 
	// this method decreases the number of iteration requared to check a number is prime or not
	for(int i=2;i<=sqrt(n);i++)
	{
		//c++;		//comment out (also line no. 27) to see how many times the loop runs
		if(n%i==0)
		{
			p=0;
			
			break;
		}
	}
	//printf("%d\n",c); //comment out (also line no. 19) to see how many times the loop runs
	if(p==1&&n>1)
	{
		//if the number passes the if condition then the number is prime
		//now we need to reverse the number and store it in a variable say rn
		int rn=0;
		for(int i=n;i!=0;i/=10)
		{
			rn=rn*10+i%10;
		}
		printf("Reversed number is %d\n",rn); //comment out to see the reversed number
		//chek if rn is prime or not
		for(int i=2;i<=sqrt(rn);i++)
		{
			//c++;		//comment out (also line no. 27) to see how many times the loop runs
			if(rn%i==0)
			{
				p=0;
				
				break;
			}
		}
		//printf("%d\n",c); //comment out (also line no. 19) to see how many times the loop runs
		if(p==1&&rn>1)
		{
			printf("Twisted prime number\n");
		}
		else
		{
			printf("Reversed number is not a prime number\n");
		}
	}
	else
	{
		printf("Entered number is not a prime number\n");
	}
}

/*test values
11,13,17,37,167.....
*/
