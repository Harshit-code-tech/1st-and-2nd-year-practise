/*
17) sunny number : A number is a sunny number if N+1 is a perfect square.
 example = 8 
	  8+1=9 , 9 is a perferct square
*/
#include <stdio.h>
#include <math.h>
int main()
{
	int n;
	printf("Enter a number\n");
	scanf("%d",&n);
	//finding root of n+1
	float root=sqrt(n+1);
	//(int)root convers the float value to integer value (x.abcd is converted to x)
	//if a number is perfect square it will not have any decimal value in the root
	if(root==(int)root)
	{
		printf("Entered number is a sunny number\n");
	}
	else
	{
		printf("Entered number is not a sunny number\n");
	}
	return 0;
}
