#include <stdio.h>
int main()
{
	int n,a;
	float sv,d;
	printf("Enter toatl number of studets \n");
	scanf("%d",&n);
	
	int p;
	printf("Enter number of studets present\n");
	scanf("%d",&p);
	a=n-p;
	float pa=(a*100/n);
	printf("Percentage of studet absent %f\n",pa);
	
	sv=(pa>80)?60:(pa<=80 && pa>60)?60-((80-pa)*0.5):(pa<=60 && pa>=20)?pa-10:0;
	
	
	printf("Free time %f min\n",sv);
	return 0;
}