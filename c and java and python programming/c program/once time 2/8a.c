#include<stdio.h>

int main()
{
	int x, y;
	printf("Enter Value of x and y: \n  ");
	scanf("%d%d", &x,&y);
	

	int a = x;
	x = y;
	y = a;

	printf("\nAfter Swapping:  %d%d\n", x, y);
	return 0;
}
