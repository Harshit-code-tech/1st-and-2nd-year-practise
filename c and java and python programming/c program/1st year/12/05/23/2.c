#include <stdio.h>

struct Dis
{
    int feet;
    int inch;
} Dis1, Dis2, sum;

struct Dis addDiss(struct Dis d1, struct Dis d2)
{
    struct Dis result;
    result.feet = d1.feet + d2.feet;
    result.inch = d1.inch + d2.inch;
    if (result.inch >= 12)
    {
        result.feet += result.inch / 12;
        result.inch = result.inch % 12;
    }
    return result;
}

int main()
{

    printf("Enter the first Dis:\n");
    printf("Feet: ");
    scanf("%d", &Dis1.feet);
    printf("Inches: ");
    scanf("%d", &Dis1.inch);

    printf("\nEnter the second Dis:\n");
    printf("Feet: ");
    scanf("%d", &Dis2.feet);
    printf("Inches: ");
    scanf("%d", &Dis2.inch);

    sum = addDiss(Dis1, Dis2);
    printf("\nSum of Diss: %d feet %d inches\n", sum.feet, sum.inch);

    return 0;
}
