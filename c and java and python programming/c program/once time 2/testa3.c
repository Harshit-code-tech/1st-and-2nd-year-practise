#include<stdio.h>
int main(){
    float i,j,k,l;
    printf("angle 1: \n");
    scanf("%f",&i);
    printf("angle 2: \n");
    scanf("%f",&j);
    k=i+j;
    l=180-k;
    printf("Angle 3:%.3f\n",l);
    return 0;
}