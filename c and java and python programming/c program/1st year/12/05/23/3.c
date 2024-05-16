#include <stdio.h>

struct Dis
{
    int km;
    int meter;
} Dis1, Dis2, sum;

struct Dis addDiss(struct Dis d1, struct Dis d2)
{
    struct Dis result;
    result.km = d1.km + d2.km;
    result.meter = d1.meter + d2.meter;
    if (result.meter >= 1000)
    {
        result.km += result.meter / 1000;
        result.meter = result.meter % 1000;
    }
    return result;
}

int main()
{

    printf("Enter the first Dis:\n");
    printf("Kilometers: ");
    scanf("%d", &Dis1.km);
    printf("Meters: ");
    scanf("%d", &Dis1.meter);

    printf("\nEnter the second Dis:\n");
    printf("Kilometers: ");
    scanf("%d", &Dis2.km);
    printf("Meters: ");
    scanf("%d", &Dis2.meter);

    sum = addDiss(Dis1, Dis2);

    printf("\nSum of Diss: %d kilometers %d meters\n", sum.km, sum.meter);

    return 0;
}
