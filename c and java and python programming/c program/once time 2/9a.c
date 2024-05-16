#include<stdio.h>
int main(){ 
    int a,b;
    char name[50];
    printf("enter bill no.: , Name of the customer: ,total no. of person: \n");
    scanf(" %d %s %d",&a,name,&b);
    

    int B,D,S,A,J,R,c,d,e,f,g,h;
    printf("Enter the no.s of food ordered :");
    scanf("%d%d%d%d%d%d",&B,&D,&S,&A,&J,&R);
    c=B*50;
    d=D*40;
    e=S*30;
    f=A*20;
    g=J*10;
    h=R*12;
    printf("\n ---------------------------------------------------");
    printf("\n          Welcome To KIIT\n        _________________\n          BILL NO :%d\n          Name:%s\n          Total person:%d\n ",a,name,b);
    printf(" Item  | No.   | amt\t| ");
    printf("\n --------------------------");
    printf("\n| B\t| %d\t| %d\t|",B,c);
    printf("\n| D\t| %d\t| %d\t |",D,d);
    printf("\n| S\t| %d\t| %d\t |",S,e);
    printf("\n| A\t| %d\t| %d\t |",A,f);
    printf("\n| J\t| %d\t| %d\t |",J,g);
    printf("\n| R\t| %d\t| %d\t |",R,h);
    printf("\n --------------------------");
    printf("\n\t Total: Rs.%d",c+d+e+f+g+h);
    printf("\n --------------------------");
    printf("\n  Thank you visit again");
return 0;
}