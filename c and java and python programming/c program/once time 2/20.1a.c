#include <stdio.h>

int main() {
    int a = 5;
    int b, c;

    b = a >> 3; // right shift operator
    c = a << 3; // left shift operator

    printf("a = %d\n", a);
    printf("b = %d\n", b);
    printf("c = %d\n", c);

    return 0;
}
