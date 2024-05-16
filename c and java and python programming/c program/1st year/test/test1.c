#include<stdio.h>
#define c 5
int main(){
    int a[c];
    int i;
    printf("Enter the elements\n");
    for (i=0;i<5;i++){
        scanf("%d",&a[i]);

    }
    for (i=0;i<5;i++){
        if(a[i]<0){
            printf("%d\n",a[i]);
        }
        else{printf(" ");
        }
    }
    return 0;
}