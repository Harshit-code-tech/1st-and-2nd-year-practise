/*
12) A Smith Number is a composite number whose sum of digits is equal to the sum of digits in its prime factorization. Examples:

Input  : n = 4
Output : Yes
Prime factorization = 2, 2  and 2 + 2 = 4
Therefore, 4 is a smith number
*/
#include <stdio.h>
int main()
{
	//accepting a number from the user in n
	int n,s=0;	//s stores the sum of the digits of all the prime factor
	printf("Enter a number\n");
	scanf("%d",&n);
	//ensuring entered number is a composite number i.e. not a prime number
	int p=0;
	for(int j=1;j<=n;j++)
	{
		//the j loop runs from 1 to n
		if(n%j==0)
		{
			//if j is a factor of n then the if case passes and the value of counter increases by 1
			p++;
		}
	}
	// is n is a prime number the value of p is 2
	
	//finding the sum of the digits of the given number n and storing it in sd
	
	int sd=0;
	for(int k=n;k!=0;k=k/10)
	{
		int r=k%10;
		sd=sd+r;
	}
	
	//all composite numbers will have prime factors in between 2 to n-1
	for(int i=2;i<=n;i++)
	{
		//if any number in the range 2 to n-1 divides the number completely then it is a factor of that number. 
		//however it may or may not be a prime factor
		if(n%i==0)
		{
			//printf("i is %d\n",i);-->commnet out to check the factors of n
			//checking if the entering value of i is a prime number or not given that it is a factor
			//using a j loop ot check the condition for prime factor i.e. factor counter must be 2
			int c=0;
			for(int j=1;j<=i;j++)
			{
				//the j loop runs from 1 to i
				if(i%j==0)
				{
					//if j is a factor of i then the if case passes and the value of counter increases by 1
					//printf("j is %d\n",j); ->comment out to know the value of j that divides i
					c++;
				}
			}
			if(c==2)
			{	//printf("i is %d prime\n",i); ->comment out to know the prime facotrs
				//if the number i has 2 factors only then it is a prime number
				do
				{
					//k loop stores the sum of digits of a prime factor in sdp
					int sdp=0;
					for(int k=i;k!=0;k=k/10)
					{
						int r=k%10;
						sdp=sdp+r;
					}
					//printf("sdp is %d\n",sdp); -> comment out to know sdp
					s=s+sdp;
					//printf("s is %d\n",s); -> comment out to know sum after each iteration
					n=n/i;
					//printf("new value of n is %d\n",n); ->comment out to see how n gets moidified .... the logic is somewhat similar to finding out lcm of a number
				}
				while(n%i==0);
				//do while loop is used to handle cases when a prime number is repetatively the factor of a number
				/*
				for example: n = 666
				Prime factorization = 2, 3, 3, 37
				here 3 is a repeated factor
				*/
			}
		}
	}
	
	//checking for smith number
	
	//if sum of digit (sd) is equal to sum of digits of all prime factor (s) then the number is smith number according to the given defination
	
	if(sd==s && p!=2)
	{
		printf("Smith number\n");
	}
	else
	{
		printf("Not a smith number\n");
	}
	return 0;
}
				
/*Test values

The first few Smith numbers are: 4, 22, 27, 58, 85, 94, 121, 166, 202, 265, 274, 319, 346, 355, 378, 382, 391, 438, 454, 483, 517, 526, 535, 562, 576, 588, 627, 634, 636, 645, 648, 654, 663, 666, 690, 706, 728, 729, 762, 778, 825, 852, 861, 895, 913, 915, 922, 958, 985, 1086

*/
