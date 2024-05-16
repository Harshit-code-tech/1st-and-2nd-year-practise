#include <stdio.h>

int isMagicNumber(int n) {
    while (n > 9) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        n = sum;
    }
    return (n == 1);
}

int main() {
    int number ;
    printf("Enter the number: \n");
    scanf("%d",number);
    printf("%d is%s a Magic Number\n", number, isMagicNumber(number) ? "" : " not");
    return 0;
}
