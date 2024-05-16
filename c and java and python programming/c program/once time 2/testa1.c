#include<stdio.h>
int main(){
    int i,num,sum=0;
    printf("Enter the number: \n");
    scanf("%d",&num);
    for(i=1;i<=num;i/10)
        sum=sum+(i%10)*(i%10)*(i%10);
    
    if(sum==num){
        printf("Armstrong");
    }else{
        printf("not");
    }
    return 0;
}