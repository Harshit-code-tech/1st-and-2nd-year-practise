#include<stdio.h>
int main(){
    int a=10,c,d;
    printf("c and d:");
    scanf("%d%d",&c,&d);
    printf("Bitwise AND: %d\n", a &(c&d));
    printf("Bitwise OR: %d\n", a|(c|d));
    printf("Bitwise XOR: %d\n", a^(c^d));
    printf("Bitwise Left Shift: %d\n", a <<(c<<d));
    printf("Bitwise Right Shift: %d\n", a >>(c>>d));
    return 0;
}