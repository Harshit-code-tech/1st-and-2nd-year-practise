//This program checks for neon number
#include <stdio.h>
int main()
{
	//accept a number from the user ... let it be stored in n
	int n;
	printf("Enter a number \n");
	scanf("%d",&n);
	
	//find the square of the number ... let it be stored in sq
	int sq=n*n;
	
	//find the sum of the digits of the square of the number
	//finding the sum of the digits of sq and stroing it in s 
	int s=0;
	for(int i=sq;i!=0;i/=10)
	{
		s=s+i%10;
	}
	//after this step we have the sum of the digits of sq stored in s
	
	//for a number to be neon number s must be euqal to n
	if(s==n)
	{
		printf("Entered number is a neon number \n");
	}
	else
	{
		printf("Entered number is not a neon number \n");
	}
	return 0;
}
