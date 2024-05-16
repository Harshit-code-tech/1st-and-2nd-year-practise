//Ugly number : Whose prime factors are 2,3 or 5
#include <stdio.h>
int main()
{
	//accepting a number from the user
	int n;
	printf("Enter a number\n");
	scanf("%d",&n);
	//if a number has 2,3 or 5 as its factor then it is also divisible by 2,3 or 5
	if(n%2==0||n%3==0||n%5==0)
	{
		printf("Ugly number\n");
	}
	else
	{
		printf("Not an ugly number\n");
	}
	return 0;
}
