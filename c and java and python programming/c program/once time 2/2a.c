#include<stdio.h>
#include<math.h>

int main(){
    float a,b,c;
    printf(" write the value of a,b: \n");
    scanf("%f%f",&a,&b);
    c=sqrt(a*a+b*b);
    printf("answer is %f\n",c);
    return 0;

}