#include <stdio.h>
int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}
int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
}
int main() {
    int a, b;
    printf("Enter two positive integers: ");
    scanf("%d%d", &a, &b);
    printf("LCM of %d and %d is %d\n", a, b, lcm(a, b));
    return 0;
}
