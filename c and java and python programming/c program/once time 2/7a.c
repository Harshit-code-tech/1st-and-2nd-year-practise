#include <stdio.h>

int main() {
    int a, sum = 0;
    printf ("Enter the 3 digit's integer number::\n");
    scanf ("%d", &a);
    printf ("The sum of %d digits is = ", a);
    sum = (a % 10) + ((a / 10) % 10) + (a / 100);
    printf ("%d\n", sum);
    return 0;
}