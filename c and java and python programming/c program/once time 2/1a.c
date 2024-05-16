#include<stdio.h>
#include<math.h>

int main(){
    float x1,x2,y1,y2,m;
    printf("enter the value of x1,x2,y1,y2\n");
    scanf("%f%f%f%f",&x1,&x2,&y1,&y2);
    m=sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    printf("the ans is %f\n",m);
return 0;
}