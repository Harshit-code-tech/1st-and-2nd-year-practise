#include <stdio.h>

int esum(int n) {
    if (n == 0) 
        return 0;
    
    int digit = n % 10;
    if (digit % 2 == 0) 
        return digit + esum(n / 10);
     else { 
        return esum(n / 10);
    }
}


int main() {
    int num;
    printf("Enter an integer: ");
    scanf("%d", &num);
    int result = esum(num);
    printf("Sum of even digits in %d is %d\n", num, result);
    return 0;
}

