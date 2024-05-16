# include <stdio.h>
int main(){
    int a, b, c, d;
    printf("\nEnter the principal, Rate and the time: ");
    scanf("%d%d%d", &a,&b,&c);
    d = (a * b * c)/100;
    printf("The Simple interest is %d\n", d);
    return 0;
}
