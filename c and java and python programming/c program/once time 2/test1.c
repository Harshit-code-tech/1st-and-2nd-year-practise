#include<stdio.h>

int main(){
    int a=5;

    // do-while loop
    do{
        printf("Value of a: %d\n",a);
        a=a+1;
    }while(a<30);
    
    int b=5;
    
    // for loop
    for(b=5;b<30;b++){
        printf("Value of b: %d\n",b);
    }
    
    int c=5;
    
    // while loop
    while(c<30){
        c++;
        printf("Value of c: %d\n",c);
    }    

    return 0;
}
