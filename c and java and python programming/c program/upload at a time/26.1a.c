#include <stdio.h>

int main() {
    printf("Size of char: %llu byte\n", sizeof(char));
    printf("Size of short: %llu bytes\n", sizeof(short));
    printf("Size of int: %llu bytes\n", sizeof(int));
    printf("Size of long: %llu bytes\n", sizeof(long));
    printf("Size of long long: %llu bytes\n", sizeof(long long));
    printf("Size of float: %llu bytes\n", sizeof(float));
    printf("Size of double: %llu bytes\n", sizeof(double));
    printf("Size of long double: %llu bytes\n", sizeof(long double));
    return 0;
}
