#include <stdio.h>

int main() {
    int num = 10;
    printf("The value of num is %d\n%d\n", num++,num);
    printf("The address of num is %d\n",++num);
    return 0;
}
