// c program to add two Ts( in hr-min-sec)by passing structure to a function
#include <stdio.h>

typedef struct
{
    int h;
    int m;
    int s;
} T;

void add(T *t1, T *t2, T *sum)
{
    sum->s = t1->s + t2->s;
    sum->m = t1->m + t2->m + (sum->s / 60);
    sum->h = t1->h + t2->h + (sum->m / 60);
    sum->s %= 60;
    sum->m %= 60;
}

int main()
{
    T T1, T2, sum;

    printf("Enter First Time (hours:minutes:seconds): ");
    scanf("%d %d %d", &T1.h, &T1.m, &T1.s);

    printf("Enter Second Time (hours:minutes:seconds): ");
    scanf("%d %d %d", &T2.h, &T2.m, &T2.s);

    add(&T1, &T2, &sum);

    printf("Sum of Times: %02d:%02d:%02d\n", sum.h, sum.m, sum.s);

    return 0;
}
