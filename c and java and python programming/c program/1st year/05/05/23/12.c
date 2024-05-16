//with rt/ with arg
#include <stdio.h>

int check(int n) {
    if (n % 2 == 0) {
        return 1;
    } else {
        return 0;
    }
}

int main() {
    int x, result;
    printf("Enter an integer: \n");
    scanf("%d", &x);
    result = check(x);
    if (result == 1) {
        printf("\n%d is even.\n", x);
    } else {
        printf("\n%d is odd\n",x);
    }
    return 0;
}

        
        
